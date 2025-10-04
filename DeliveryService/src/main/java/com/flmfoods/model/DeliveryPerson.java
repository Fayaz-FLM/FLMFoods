package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_persons")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeliveryPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryPersonId;
	
	private String deliveryPersonName;
	
	private String deliveryPersonAadharNo;
	
	private String deliveryPersonPhoneNo;
	
	private String deliveryPersonEmail;
	
	private Boolean isAvailable;
	
	private double rating;
	
	@OneToMany(mappedBy = "deliveryPerson", cascade = CascadeType.ALL)
	private List<DeliveryAssignment> deliveryAssignments;
	
	
	
}
