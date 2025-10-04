package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Data Transfer Object for incoming delivery assignment requests.
 * Used when creating or updating delivery assignment information.
 * 
 * <p>This DTO encapsulates all the necessary information required to
 * create or modify a delivery assignment, linking an order to a delivery partner.</p>
 *
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignmentRequestDTO {
    
    /**
     * Unique identifier for the delivery assignment.
     * May be null when creating a new assignment.
     */
    private Long assignmentId;
    
    /**
     * Reference to the order ID that this delivery assignment is for.
     * Links the delivery to a specific customer order.
     */
    private Long orderId;
    
    /**
     * Current status of the delivery assignment.
     * Common values: "ASSIGNED", "PICKED_UP", "IN_TRANSIT", "DELIVERED", "CANCELLED".
     */
    private String status;
    
    /**
     * Timestamp when the delivery was assigned to the delivery partner.
     * Used for tracking delivery timelines and performance metrics.
     */
    private LocalDateTime assignedTime;
    
    /**
     * The delivery partner request information for this assignment.
     * Contains details about the partner assigned to deliver the order.
     */
    private DeliveryPartnerRequestDTO deliveryPartnerRequest;
}

