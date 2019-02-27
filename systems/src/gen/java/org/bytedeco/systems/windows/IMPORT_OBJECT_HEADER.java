// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMPORT_OBJECT_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMPORT_OBJECT_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMPORT_OBJECT_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMPORT_OBJECT_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMPORT_OBJECT_HEADER position(long position) {
        return (IMPORT_OBJECT_HEADER)super.position(position);
    }

    public native @Cast("WORD") short Sig1(); public native IMPORT_OBJECT_HEADER Sig1(short Sig1);                       // Must be IMAGE_FILE_MACHINE_UNKNOWN
    public native @Cast("WORD") short Sig2(); public native IMPORT_OBJECT_HEADER Sig2(short Sig2);                       // Must be IMPORT_OBJECT_HDR_SIG2.
    public native @Cast("WORD") short Version(); public native IMPORT_OBJECT_HEADER Version(short Version);
    public native @Cast("WORD") short Machine(); public native IMPORT_OBJECT_HEADER Machine(short Machine);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMPORT_OBJECT_HEADER TimeDateStamp(int TimeDateStamp);              // Time/date stamp
    public native @Cast("DWORD") int SizeOfData(); public native IMPORT_OBJECT_HEADER SizeOfData(int SizeOfData);                 // particularly useful for incremental links
        public native @Cast("WORD") short Ordinal(); public native IMPORT_OBJECT_HEADER Ordinal(short Ordinal);                // if grf & IMPORT_OBJECT_ORDINAL
        public native @Cast("WORD") short Hint(); public native IMPORT_OBJECT_HEADER Hint(short Hint); 

    public native @Cast("WORD") @NoOffset short Type(); public native IMPORT_OBJECT_HEADER Type(short Type);                   // IMPORT_TYPE
    public native @Cast("WORD") @NoOffset short NameType(); public native IMPORT_OBJECT_HEADER NameType(short NameType);               // IMPORT_NAME_TYPE
    public native @Cast("WORD") @NoOffset short Reserved(); public native IMPORT_OBJECT_HEADER Reserved(short Reserved);              // Reserved. Must be zero.
}