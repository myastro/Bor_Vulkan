#include <bor.vulkan.structs.VkPhysicalDeviceMemoryProperties.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryTypeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryTypeCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:291

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:300

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryTypeCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryTypes0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj__memoryTypes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* _memoryTypes = (long long*)(obj__memoryTypes ? env->GetLongArrayElements(obj__memoryTypes, 0) : NULL);


//@line:309

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  uint32_t count = vkObj->memoryTypeCount;
                  for(uint32_t i = 0;  i<count; i++){
                    VkMemoryType* pType = (VkMemoryType*) reinterpret_cast<VkMemoryType*>(_memoryTypes[i]);
                    VkMemoryType type = *pType;
                    vkObj->memoryTypes[i] = type;
                  }
		  //vkObj->memoryTypes = (VkMemoryType[]) (_memoryTypes);
	  
	if(obj__memoryTypes != NULL){
		 env->ReleaseLongArrayElements(obj__memoryTypes, (jlong*)_memoryTypes, 0);
	}

}

static inline void wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_types, unsigned char* ptr, long long* types) {

//@line:324

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  uint32_t count = vkObj->memoryTypeCount;
		  for(uint32_t i = 0;  i<count; i++){
		     types[i] = reinterpret_cast<jlong>(&vkObj->memoryTypes[i]);
		  }
		  //return (VkMemoryType[]) (vkObj->memoryTypes);
	 
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_types) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* types = (long long*)(obj_types ? env->GetLongArrayElements(obj_types, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0(env, clazz, obj_ptr, obj_types, ptr, types);

	if(obj_types != NULL){
		 env->ReleaseLongArrayElements(obj_types, (jlong*)types, 0);
	}

	return;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryHeapCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryHeapCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:337

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:346

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryHeapCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryHeaps0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj__memoryHeaps, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* _memoryHeaps = (long long*)(obj__memoryHeaps ? env->GetLongArrayElements(obj__memoryHeaps, 0) : NULL);


//@line:355

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryHeapCount = (uint32_t)len;
		  for(jint i = 0; i<len; i++){
		    VkMemoryHeap* pHeap =  reinterpret_cast<VkMemoryHeap*>(_memoryHeaps[i]);
		    VkMemoryHeap heap = *pHeap; 
		    vkObj->memoryHeaps[i] =  heap;
		  }
		  
	  
	if(obj__memoryHeaps != NULL){
		 env->ReleaseLongArrayElements(obj__memoryHeaps, (jlong*)_memoryHeaps, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_heaps) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* heaps = (long long*)(obj_heaps ? env->GetLongArrayElements(obj_heaps, 0) : NULL);


//@line:370

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  uint32_t len = vkObj->memoryHeapCount;
                  for(uint32_t i = 0; i < len; i++){
                    VkMemoryHeap* pHeap = &vkObj->memoryHeaps[i];
                    heaps[i] = reinterpret_cast<jlong>(pHeap);
                  }
	 
	if(obj_heaps != NULL){
		 env->ReleaseLongArrayElements(obj_heaps, (jlong*)heaps, 0);
	}

}

