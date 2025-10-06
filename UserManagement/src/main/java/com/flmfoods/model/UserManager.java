package com.flmfoods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userManager")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManager {
	
	private int UserId;
	private String name;
	private long phone;
	private String email;


}
