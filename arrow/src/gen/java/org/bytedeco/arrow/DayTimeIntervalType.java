// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Represents a number of days and milliseconds (fraction of day). */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DayTimeIntervalType extends IntervalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DayTimeIntervalType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DayTimeIntervalType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DayTimeIntervalType position(long position) {
        return (DayTimeIntervalType)super.position(position);
    }
    @Override public DayTimeIntervalType getPointer(long i) {
        return new DayTimeIntervalType(this).position(position + i);
    }

  public static class DayMilliseconds extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public DayMilliseconds() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public DayMilliseconds(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public DayMilliseconds(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public DayMilliseconds position(long position) {
          return (DayMilliseconds)super.position(position);
      }
      @Override public DayMilliseconds getPointer(long i) {
          return new DayMilliseconds(this).position(position + i);
      }
  
    public native int days(); public native DayMilliseconds days(int setter);
    public native int milliseconds(); public native DayMilliseconds milliseconds(int setter);
    public native @Cast("bool") @Name("operator ==") boolean equals(@ByVal DayMilliseconds other);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@ByVal DayMilliseconds other);
    public native @Cast("bool") @Name("operator <") boolean lessThan(@ByVal DayMilliseconds other);
  }
  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public native IntervalType.type interval_type();

  public DayTimeIntervalType() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native int bit_width();

  public native @StdString String ToString();
  public native @StdString String name();
}