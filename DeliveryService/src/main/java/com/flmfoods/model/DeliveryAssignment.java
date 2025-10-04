package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Entity class representing a delivery assignment in the FLM Foods delivery system.
 * A delivery assignment links an order to a delivery partner and tracks the delivery status.
 * 
 * <p>This entity maintains the relationship between orders and delivery partners,
 * along with the current status and timing information of the delivery.</p>
 *
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignment {
    
    /**
     * Unique identifier for the delivery assignment.
     * Auto-generated using database identity strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignmentId;
    
    /**
     * Reference to the order ID that this delivery assignment is associated with.
     * This links the delivery to a specific customer order in the order service.
     */
    private Long orderId;

    /**
     * The delivery partner assigned to deliver this order.
     * 
     * <p>This is a many-to-one relationship with {@link DeliveryPartner}.
     * Multiple delivery assignments can be associated with a single delivery partner.</p>
     */
    @ManyToOne
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliveryPartner;

    /**
     * Current status of the delivery assignment.
     * Common values include: "ASSIGNED", "PICKED_UP", "IN_TRANSIT", "DELIVERED", "CANCELLED".
     * 
     * <p>Note: Consider using an enum for better type safety and validation.</p>
     */
    private String status;
    
    /**
     * Timestamp when the delivery was assigned to the delivery partner.
     * Used for tracking delivery timelines and performance metrics.
     */
    private LocalDateTime assignedTime;
}
