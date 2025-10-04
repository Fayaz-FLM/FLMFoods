package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Data Transfer Object for outgoing delivery assignment responses.
 * Used when returning delivery assignment information to clients.
 * 
 * <p>This DTO contains the delivery assignment details including the order reference,
 * status, timing information, and associated delivery partner details.</p>
 * 
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignmentResponseDTO {
    
    /**
     * Unique identifier for the delivery assignment.
     */
    private Long assignmentId;
    
    /**
     * Reference to the order ID that this delivery assignment is for.
     * Links the delivery to a specific customer order.
     */
    private Long orderId;
    
    /**
     * Current status of the delivery assignment.
     * Indicates the current state of the delivery process.
     * Common values: "ASSIGNED", "PICKED_UP", "IN_TRANSIT", "DELIVERED", "CANCELLED".
     */
    private String status;
    
    /**
     * Timestamp when the delivery was assigned to the delivery partner.
     * Used for tracking delivery timelines and calculating delivery duration.
     */
    private LocalDateTime assignedTime;
    
    /**
     * The delivery partner response information for this assignment.
     * Contains complete details about the partner assigned to deliver the order.
     */
    private DeliveryPartnerResponseDTO deliveryPartnerResponse;

}
