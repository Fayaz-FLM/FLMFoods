package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Data Transfer Object for outgoing delivery partner responses.
 * Used when returning delivery partner information to clients.
 * 
 * <p>This DTO contains the delivery partner details that are safe to expose
 * to external clients, including their assignments and contact information.</p>
 *
 * @author Manuroop Sodagiri
 * @since 2025-10-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerResponseDTO {
    
    /**
     * Unique identifier for the delivery partner.
     */
    private Long id;
    
    /**
     * Full name of the delivery partner.
     */
    private String name;
    
    /**
     * Aadhar card number of the delivery partner.
     * 12-digit unique identification number.
     */
    private String aadhar;
    
    /**
     * Contact phone number of the delivery partner.
     */
    private String phone;
    
    /**
     * Email address of the delivery partner.
     */
    private String email;
    
    /**
     * Current availability status of the delivery partner.
     * {@code true} if available for new assignments, {@code false} otherwise.
     */
    private boolean available;
    
    /**
     * List of delivery assignments associated with this delivery partner.
     * Contains both current and historical delivery assignments.
     */
    private List<DeliveryAssignmentResponseDTO> deliveryAssignmentResponseDTO;
}
