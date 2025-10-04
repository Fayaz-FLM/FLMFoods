package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Data Transfer Object for incoming delivery partner requests.
 * Used when creating or updating delivery partner information.
 * 
 * <p>This DTO encapsulates all the necessary information required to
 * create or modify a delivery partner record in the system.</p>
 *
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerRequestDTO {
    
    /**
     * Unique identifier for the delivery partner.
     * May be null when creating a new delivery partner.
     */
    private Long id;
    
    /**
     * Full name of the delivery partner.
     * Required field for partner registration.
     */
    private String name;
    
    /**
     * Aadhar card number of the delivery partner.
     * 12-digit unique identification number for identity verification.
     */
    private String aadhar;
    
    /**
     * Contact phone number of the delivery partner.
     * Used for communication regarding delivery assignments.
     */
    private String phone;
    
    /**
     * Availability status of the delivery partner.
     * {@code true} if available for new assignments, {@code false} otherwise.
     */
    private boolean isAvailable;
    
    /**
     * List of delivery assignment requests associated with this delivery partner.
     * Used when creating or updating multiple assignments in a single request.
     */
    private List<DeliveryAssignmentRequestDTO> deliveryAssignmentRequestDTO;
}
