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
@Table(name="deliveryPersons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPerson {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long deliveryPersonId;
	private String deliveryPersonName;
	private String aadharNum;
	private String phoneNum;
	private String email;
	private boolean isAvailable;
	private double rating;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="deliveryPerson")
	private List<DeliverAssaignment> deliveryAssaignments;
	
	
}
