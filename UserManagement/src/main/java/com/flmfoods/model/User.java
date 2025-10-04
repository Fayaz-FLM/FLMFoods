package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   userId;
	
	private String userName;
	
	private String userPhoneNo;
	
	private String userEmail;
	
	private String userPassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_Id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy= "user")
	private List<Orders> orders;
	
	
	
}
