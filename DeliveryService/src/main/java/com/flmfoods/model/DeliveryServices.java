package com.flmfoods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Delivery")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryServices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DeliveryId;
	private int DeliveryAddress;
	private int ItemNo;
	private int Rating;
	
}
