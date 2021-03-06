#include <bor.vulkan.structs.VkDescriptorSetAllocateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:320

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:330

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:340

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:351

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_setDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _descriptorPool) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:361

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorPool = (VkDescriptorPool) (_descriptorPool);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorPool0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:371

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->descriptorPool);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorPool0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_setDescriptorSetCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorSetCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:381

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorSetCount = (uint32_t) (_descriptorSetCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorSetCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:391

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jint) (vkObj->descriptorSetCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorSetCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getDescriptorSetCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_setPSetLayouts0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSetLayouts) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSetLayouts = (char*)(obj__pSetLayouts?env->GetDirectBufferAddress(obj__pSetLayouts) : NULL);


//@line:400

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorSetLayout* p_pSetLayouts = ( VkDescriptorSetLayout*) _pSetLayouts; 
		 vkObj->pSetLayouts = p_pSetLayouts; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPSetLayouts0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:411

		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pSetLayouts );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPSetLayouts0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetAllocateInfo_getPSetLayouts0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

