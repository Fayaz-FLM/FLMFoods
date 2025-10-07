package com.flmfoods.model;

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
@Table(name = "user_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userAddressId;

    private String doorNo;
    private String street;
    private String landmark;
    private String city;
    private String district;
    private String state;
    private String pincode;
    private String addressType; // home or work

    @ManyToOne
    @JoinColumn(name = "user_id") 
    private User user;
}

