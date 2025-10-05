package com.flmfoods.dto;

public class AddresDto {

private String landmark;
	
	private String city;
	
	private String pincode;
	
	private String state;

	public AddresDto(String landmark, String city, String pincode, String state) {
		super();
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
