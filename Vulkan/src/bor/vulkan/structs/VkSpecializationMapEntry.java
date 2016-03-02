/**
 * Class wrapping Vulkan's VkSpecializationMapEntry struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSpecializationMapEntry. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSpecializationMapEntry {
 *     uint32_t    constantID;
 *     uint32_t    offset;
 *     size_t      size;
 * } VkSpecializationMapEntry;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSpecializationMapEntry extends VkStruct {
	/** TAG of this structure [170]  */
	 private static final String TAG = "VkSpecializationMapEntry";

	/** ID of this structure [170]  */
	 public static final int TAG_ID = VKSPECIALIZATIONMAPENTRY_ID;

	 // fields //
	/**
	 *  uint32_t 	constantID 
	 */ 
	int 	constantID;

	/**
	 *  uint32_t 	offset 
	 */ 
	int 	offset;

	/**
	 *  size_t 	size 
	 */ 
	long 	size;

	/**
	 * Ctor
	 */
	public VkSpecializationMapEntry(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field constantID
	 * Prototype: uint32_t  constantID
	 */ 
	 public void constantID(int constantID){
		 this.constantID = constantID;
		constantID0(super.ptr, constantID);
	 }

	/**
	 * get method for field constantID
	 * Prototype: uint32_t  constantID
	 */ 
	 public int constantID(){
		 // return  this.constantID;
		 return constantID0(super.ptr);
	 }

	/**
	 * Set method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field size
	 * Prototype: size_t  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size
	 * Prototype: size_t  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field constantID
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native void constantID0(ByteBuffer ptr, int _constantID);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(*ptr);
		  _obj.constantID = (uint32_t) (_constantID);
	  */

	/**
	 * get method for field constantID
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native int constantID0(ByteBuffer ptr);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, int _offset);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(*ptr);
		  _obj.offset = (uint32_t) (_offset);
	  */

	/**
	 * get method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(ByteBuffer ptr);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field size
	 * Prototype: size_t  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(*ptr);
		  _obj.size = (size_t) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: size_t  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkSpecializationMapEntry _obj = (VkSpecializationMapEntry)(ptr);
		  return (jlong) (_obj.size_t);
	 */



} // end of class VkSpecializationMapEntry
