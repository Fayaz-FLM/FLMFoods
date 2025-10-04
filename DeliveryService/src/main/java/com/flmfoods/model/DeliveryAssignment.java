package com.flmfoods.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_persons")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeliveryAssignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long assignmentId;
	
	private long orderId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "delivery_person_id")
	private DeliveryPerson deliveryPerson;
	
	private String deliveryStatus;
	
	private LocalDateTime assignedTime;
}
