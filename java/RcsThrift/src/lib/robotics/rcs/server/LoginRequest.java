/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package lib.robotics.rcs.server;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginRequest implements org.apache.thrift.TBase<LoginRequest, LoginRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LoginRequest");

  private static final org.apache.thrift.protocol.TField ROBOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("robot_id", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LoginRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LoginRequestTupleSchemeFactory());
  }

  private String robot_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROBOT_ID((short)1, "robot_id");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROBOT_ID
          return ROBOT_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROBOT_ID, new org.apache.thrift.meta_data.FieldMetaData("robot_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LoginRequest.class, metaDataMap);
  }

  public LoginRequest() {
  }

  public LoginRequest(
    String robot_id)
  {
    this();
    this.robot_id = robot_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoginRequest(LoginRequest other) {
    if (other.isSetRobot_id()) {
      this.robot_id = other.robot_id;
    }
  }

  public LoginRequest deepCopy() {
    return new LoginRequest(this);
  }

  @Override
  public void clear() {
    this.robot_id = null;
  }

  public String getRobot_id() {
    return this.robot_id;
  }

  public void setRobot_id(String robot_id) {
    this.robot_id = robot_id;
  }

  public void unsetRobot_id() {
    this.robot_id = null;
  }

  /** Returns true if field robot_id is set (has been assigned a value) and false otherwise */
  public boolean isSetRobot_id() {
    return this.robot_id != null;
  }

  public void setRobot_idIsSet(boolean value) {
    if (!value) {
      this.robot_id = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROBOT_ID:
      if (value == null) {
        unsetRobot_id();
      } else {
        setRobot_id((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROBOT_ID:
      return getRobot_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROBOT_ID:
      return isSetRobot_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LoginRequest)
      return this.equals((LoginRequest)that);
    return false;
  }

  public boolean equals(LoginRequest that) {
    if (that == null)
      return false;

    boolean this_present_robot_id = true && this.isSetRobot_id();
    boolean that_present_robot_id = true && that.isSetRobot_id();
    if (this_present_robot_id || that_present_robot_id) {
      if (!(this_present_robot_id && that_present_robot_id))
        return false;
      if (!this.robot_id.equals(that.robot_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LoginRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LoginRequest typedOther = (LoginRequest)other;

    lastComparison = Boolean.valueOf(isSetRobot_id()).compareTo(typedOther.isSetRobot_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRobot_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.robot_id, typedOther.robot_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LoginRequest(");
    boolean first = true;

    sb.append("robot_id:");
    if (this.robot_id == null) {
      sb.append("null");
    } else {
      sb.append(this.robot_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LoginRequestStandardSchemeFactory implements SchemeFactory {
    public LoginRequestStandardScheme getScheme() {
      return new LoginRequestStandardScheme();
    }
  }

  private static class LoginRequestStandardScheme extends StandardScheme<LoginRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LoginRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROBOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.robot_id = iprot.readString();
              struct.setRobot_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LoginRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.robot_id != null) {
        oprot.writeFieldBegin(ROBOT_ID_FIELD_DESC);
        oprot.writeString(struct.robot_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LoginRequestTupleSchemeFactory implements SchemeFactory {
    public LoginRequestTupleScheme getScheme() {
      return new LoginRequestTupleScheme();
    }
  }

  private static class LoginRequestTupleScheme extends TupleScheme<LoginRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LoginRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRobot_id()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRobot_id()) {
        oprot.writeString(struct.robot_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LoginRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.robot_id = iprot.readString();
        struct.setRobot_idIsSet(true);
      }
    }
  }

}
