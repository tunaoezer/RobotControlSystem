/* Robot Control System
 * Copyright (C) 2013 Tuna Oezer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lib.robotics.rcs.android;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import lib.robotics.rcs.server.LoginRequest;
import lib.robotics.rcs.server.LogoutRequest;
import lib.robotics.rcs.server.RequestStatus;
import lib.robotics.rcs.server.RobotService;
import lib.robotics.rcs.server.RobotServiceResponse;

/**
 * @author Tuna Oezer
 * 
 * Handles communication to RCS.
 */
public class RobotServiceClient {
	
	public static final int kServerPort = 6600;
	
	private String server_address_;
	private TTransport transport_;
	private RobotService.Client client_;

	/**
	 * @param server_address Internet address of RCS server.
	 */
	public RobotServiceClient(String server_address) {
		this.server_address_ = server_address;
		transport_ = null;
		client_ = null;
	}
	
	/**
	 * Opens a connection to the RCS server. 
	 * @return True if the connection was opened successfully.
	 */
	public boolean open() {
		if (transport_ != null) return false;
		transport_ = new TSocket(server_address_, kServerPort);
		try {
			transport_.open();
			TProtocol protocol = new TBinaryProtocol(transport_);
			client_ = new RobotService.Client(protocol);
			return true;
		} catch (TTransportException e) {
			e.printStackTrace();
			transport_ = null;
		}
		return false;
	}
	
	/**
	 * Closes the connection to the RCS server.
	 */
	public void close() {
		if (transport_ == null) return;
		transport_.close();
		transport_ = null;
		client_ = null;
	}
	
	/**
	 * Logs in the robot at the RCS server.
	 * @param robot Robot to be logged in.
	 * @return True if the login was successful.
	 */
	public boolean login(Robot robot) {
		LoginRequest request = new LoginRequest();
		request.setRobot_id(robot.getRobotId());
		try {
			RobotServiceResponse response = client_.Login(request); 
			return response.getStatus() == RequestStatus.OK;
		} catch (TException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Logs out the robot from the RCS server.
	 * @param robot Robot to be logged out.
	 * @return True if the logout was successful.
	 */
	public boolean logout(Robot robot) {
		LogoutRequest request = new LogoutRequest();
		request.setRobot_id(robot.getRobotId());
		try {
			RobotServiceResponse response = client_.Logout(request);
			return response.getStatus() == RequestStatus.OK;
		} catch (TException e) {
			e.printStackTrace();
		}
		return false;
	}
}