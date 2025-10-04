package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Entity class representing a delivery partner in the FLM Foods delivery system.
 * A delivery partner is responsible for delivering orders to customers.
 * 
 * <p>This entity maintains information about the delivery partner's personal details,
 * availability status, performance rating, and their delivery assignment history.</p>
 *
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartner {
    
    /**
     * Unique identifier for the delivery partner.
     * Auto-generated using database identity strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Full name of the delivery partner.
     */
    private String name;
    
    /**
     * Aadhar card number of the delivery partner for identity verification.
     * This is a 12-digit unique identification number issued by the Government of India.
     */
    private String aadhar;
    
    /**
     * Contact phone number of the delivery partner.
     * Used for communication regarding delivery assignments.
     */
    private String phone;
    
    /**
     * Email address of the delivery partner.
     * Used for notifications and account management.
     */
    private String email;
    
    /**
     * Availability status of the delivery partner.
     * {@code true} if the partner is available for new assignments, {@code false} otherwise.
     */
    private boolean isAvailable;
    
    /**
     * List of all delivery assignments associated with this delivery partner.
     * Represents the complete delivery history and current assignments.
     * 
     * <p>This is a bidirectional one-to-many relationship with {@link DeliveryAssignment}.
     * All cascade operations are enabled, meaning changes to the delivery partner
     * will cascade to associated assignments.</p>
     */
    @OneToMany(mappedBy = "deliveryPartner",cascade = CascadeType.ALL)
    private List<DeliveryAssignment> deliveryAssignments;
    
    /**
     * Performance rating of the delivery partner.
     * Typically ranges from 0.0 to 5.0, based on customer feedback and delivery metrics.
     * Higher ratings indicate better performance.
     */
    private Double rating;
}
