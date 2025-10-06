package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	private String status;
	private double orderPrice;
	private long userId;
	private long restaurantId;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="order")
	private List<OrderItem> orderItems;
	
	
	
}
