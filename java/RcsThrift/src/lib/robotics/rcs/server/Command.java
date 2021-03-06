/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package lib.robotics.rcs.server;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Command implements org.apache.thrift.TEnum {
  STOP(1),
  MOVE_FORWARD(2),
  MOVE_BACKWARD(3),
  TURN_LEFT(4),
  TURN_RIGHT(5),
  TILT_UP(6),
  TILT_DOWN(7);

  private final int value;

  private Command(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Command findByValue(int value) { 
    switch (value) {
      case 1:
        return STOP;
      case 2:
        return MOVE_FORWARD;
      case 3:
        return MOVE_BACKWARD;
      case 4:
        return TURN_LEFT;
      case 5:
        return TURN_RIGHT;
      case 6:
        return TILT_UP;
      case 7:
        return TILT_DOWN;
      default:
        return null;
    }
  }
}
