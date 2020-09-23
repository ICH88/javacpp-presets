// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base class for union array builds.
 * 
 *  Note that while we subclass ArrayBuilder, as union types do not have a
 *  validity bitmap, the bitmap builder member of ArrayBuilder is not used. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BasicUnionBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasicUnionBuilder(Pointer p) { super(p); }

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  
  ///
  public native @ByVal Status Finish(@SharedPtr UnionArray out);

  /** \brief Make a new child builder available to the UnionArray
   * 
   *  @param new_child [in] the child builder
   *  @param field_name [in] the name of the field in the union array type
   *  if type inference is used
   *  @return child index, which is the "type" argument that needs
   *  to be passed to the "Append" method to add a new element to
   *  the union array. */
  public native byte AppendChild(@Const @SharedPtr @ByRef ArrayBuilder new_child,
                       @StdString String field_name/*=""*/);
  public native byte AppendChild(@Const @SharedPtr @ByRef ArrayBuilder new_child);
  public native byte AppendChild(@Const @SharedPtr @ByRef ArrayBuilder new_child,
                       @StdString BytePointer field_name/*=""*/);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  public native @Cast("int64_t") long length();
}