/**
 * Class wrapping Vulkan's VkPipelineDynamicStateCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineDynamicStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineDynamicStateCreateInfo {
 *     VkStructureType                      sType;
 *     const void*                          pNext;
 *     VkPipelineDynamicStateCreateFlags    flags;
 *     uint32_t                             dynamicStateCount;
 *     const VkDynamicState*                pDynamicStates;
 * } VkPipelineDynamicStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineDynamicStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [65]  */
	 private static final String TAG = "VkPipelineDynamicStateCreateInfo";

	/** ID of this structure [65]  */
	 public static final int TAG_ID = VKPIPELINEDYNAMICSTATECREATEINFO_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  VkPipelineDynamicStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	dynamicStateCount	[int]
	 */ 
	int 	dynamicStateCount;
	
	/**
	 *  const VkDynamicState* 	pDynamicStates	[vkenum_array_array]
	 */ 
	VkDynamicState[] 	pDynamicStates;
	/**
	 * Ctor
	 */
	public VkPipelineDynamicStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineDynamicStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineDynamicStateCreateInfo(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
	}

	/** 
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkPipelineDynamicStateCreateInfo> createVkArray(int size){ 
		 VkPipelineDynamicStateCreateInfo[] array = new VkPipelineDynamicStateCreateInfo[size]; 
		 VkArrayStruct<VkPipelineDynamicStateCreateInfo> vkArray = new VkArrayStruct<VkPipelineDynamicStateCreateInfo>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDynamicStateCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDynamicStateCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDynamicStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 * 
	 * @param dynamicStateCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDynamicStateCreateInfo dynamicStateCount(int dynamicStateCount){
		 this.dynamicStateCount = dynamicStateCount;
		 setDynamicStateCount0(this.ptr,  dynamicStateCount);
		 return this;
	 }

	/**
	 * Get method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public int dynamicStateCount(){
		 int var = getDynamicStateCount0(super.ptr);
		 this.dynamicStateCount = var;
		 return this.dynamicStateCount;
	 }

	/**
	 * Set method for field pDynamicStates	[vkenum_array]<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 * 
	 * @param pDynamicStates - a instance of VkDynamicState[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDynamicStateCreateInfo pDynamicStates(VkDynamicState[] pDynamicStates){
		 this.pDynamicStates = pDynamicStates;
		 int[] enumArray = readEnumArray(pDynamicStates);
		 setPDynamicStates0(this.ptr, enumArray);
		 return this;
	 }

	/**
	 * Get method for field pDynamicStates	[vkenum_array]<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public VkDynamicState[] pDynamicStates(){
		 int size = dynamicStateCount();
		 int[] values = (size==0) ? null : new int[size];
		 values = getPDynamicStates0(super.ptr, values);
		 VkDynamicState[] var = VkDynamicState.fromValues(this.pDynamicStates, values);
		 this.pDynamicStates = var;
		 return this.pDynamicStates;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineDynamicStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n dynamicStateCount: ")
				.append(dynamicStateCount() )
				.append(",\n pDynamicStates: ")
				.append(Arrays.toString(pDynamicStates()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineDynamicStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native void setDynamicStateCount0(Buffer ptr, int _dynamicStateCount);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dynamicStateCount = (uint32_t) (_dynamicStateCount);
	  */

	/**
	 * Native GET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native int getDynamicStateCount0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->dynamicStateCount);
	 */

	/**
	 * Native SET method for field pDynamicStates	[vkenum_array]<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native void setPDynamicStates0(Buffer ptr, int[]  _pDynamicStates);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for generic array assignment 
		 VkDynamicState* temp = const_cast<VkDynamicState*>(vkObj->pDynamicStates);
		 if(temp) { free(temp); } 
		 vkObj->pDynamicStates = NULL; 
		 if( _pDynamicStates == NULL){ 
		    vkObj->dynamicStateCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pDynamicStates); 
		  temp = CALLOC(count, VkDynamicState); 
		  memcpy( temp, _pDynamicStates, count * sizeof(VkDynamicState)); 
		  vkObj->pDynamicStates = temp; 
		  vkObj->dynamicStateCount = count;
	  */

	/**
	 * Native GET method for field pDynamicStates	[vkenum_array]<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native int[]  getPDynamicStates0(Buffer ptr, int[]  _pDynamicStates);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->dynamicStateCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pDynamicStates);
		  if(vkObj->pDynamicStates == NULL){
		    return NULL;
		   }
 		  memcpy(_pDynamicStates, vkObj->pDynamicStates, count * sizeof(VkDynamicState));
		  return obj__pDynamicStates;
	 */



} // end of class VkPipelineDynamicStateCreateInfo
