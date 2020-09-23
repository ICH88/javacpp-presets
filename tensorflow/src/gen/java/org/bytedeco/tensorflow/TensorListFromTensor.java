// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a TensorList which, when stacked, has the value of {@code tensor}.
 * 
 *  Each tensor in the result list corresponds to one row of the input tensor.
 * 
 *  tensor: The input tensor.
 *  output_handle: The list.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output_handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListFromTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListFromTensor(Pointer p) { super(p); }

  public TensorListFromTensor(@Const @ByRef Scope scope, @ByVal Input tensor, @ByVal Input element_shape) { super((Pointer)null); allocate(scope, tensor, element_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor, @ByVal Input element_shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListFromTensor operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListFromTensor output_handle(Output setter);
}