/**
 * Class wrapping Vulkan's VkOffset2D struct.
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
 *  This class is a Java front end for struct VkOffset2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkOffset2D {
 *     int32_t    x;
 *     int32_t    y;
 * } VkOffset2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkOffset2D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [55]  */
	 private static final String TAG = "VkOffset2D";

	/** ID of this structure [55]  */
	 public static final int TAG_ID = VKOFFSET2D_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  int32_t 	x	[int]
	 */ 
	int 	x;
	
	/**
	 *  int32_t 	y	[int]
	 */ 
	int 	y;
	/**
	 * Ctor
	 */
	public VkOffset2D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkOffset2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkOffset2D(long address){ 
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
	 public static VkArray<VkOffset2D> createVkArray(int size){ 
		 VkOffset2D[] array = new VkOffset2D[size]; 
		 VkArrayStruct<VkOffset2D> vkArray = new VkArrayStruct<VkOffset2D> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field x	[int]<br>
	 * Prototype: int32_t  x
	 * 
	 * @param x - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkOffset2D x(int x){
		 this.x = x;
		 setX0(this.ptr,  x);
		 return this;
	 }

	/**
	 * Get method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 public int x(){
		 int var = getX0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: int32_t  y
	 * 
	 * @param y - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkOffset2D y(int y){
		 this.y = y;
		 setY0(this.ptr,  y);
		 return this;
	 }

	/**
	 * Get method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public int y(){
		 int var = getY0(super.ptr);
		 this.y = var;
		 return this.y;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkOffset2D [ ")
				.append("x: ").append(x() )
				.append(",\n y: ")
				.append(y() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native void setX0(Buffer ptr, int _x);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		 // code for simple past value 
		  vkObj->x = (int32_t) (_x);
	  */

	/**
	 * Native GET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native int getX0(Buffer ptr);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * Native SET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native void setY0(Buffer ptr, int _y);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		 // code for simple past value 
		  vkObj->y = (int32_t) (_y);
	  */

	/**
	 * Native GET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native int getY0(Buffer ptr);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->y);
	 */



} // end of class VkOffset2D
