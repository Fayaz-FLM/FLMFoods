package com.flmfoods.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="deliveryAssignments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverAssaignment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long deliveryAssaignmentId;
	private String status;
	private LocalTime assignedTime;
	@OneToOne
	@JoinColumn(name="order_id",nullable=false)
	private Order order;
	@ManyToOne
	@JoinColumn(name="delivery_person_id",nullable=false)
	private DeliveryPerson deliveryPerson;
}
