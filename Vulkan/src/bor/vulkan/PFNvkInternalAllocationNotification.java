/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFNvkInternalAllocationNotification pointers.<br>
 * 
 * As stated in VkHandleInterface interface,
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFNvkInternalAllocationNotification extends VkHandle implements PFNFunction, VkHandleInterface {

    private PFNvkInternalAllocationNotification() {
    }

    /**
     * Package protected Ctor.
     * 
     * @param nativePtr - pointer to native PFNvkInternalAllocationNotification
     */
    public PFNvkInternalAllocationNotification(ByteBuffer nativePtr) {
        super(nativePtr);
    }
    
    
    public PFNvkInternalAllocationNotification(long nativePtr) {
        super(nativePtr);
    }

    /**
     * Create a pointer P to contains a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set
     * valid native pointer.
     * 
     * @return An instance of P for this VkStruct with null pointer
     */
    public static P<PFNvkInternalAllocationNotification> createNullPointer() {
        P<PFNvkInternalAllocationNotification> p = 
                new P<PFNvkInternalAllocationNotification>(new PFNvkInternalAllocationNotification());
        return p;
    }

}
