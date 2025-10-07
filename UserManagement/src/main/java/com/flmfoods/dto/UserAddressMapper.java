package com.flmfoods.dto;

import com.flmfoods.model.UserAddress;

public class UserAddressMapper {
	
	// RequestDTO -> Entity
    public static UserAddress toEntity(UserAddressRequestDto dto) {
        UserAddress address = new UserAddress();
        address.setDoorNo(dto.getDoorNo());
        address.setStreet(dto.getStreet());
        address.setLandmark(dto.getLandmark());
        address.setCity(dto.getCity());
        address.setDistrict(dto.getDistrict());
        address.setState(dto.getState());
        address.setPincode(dto.getPincode());
        address.setAddressType(dto.getAddressType());
        return address;
    }

    // Entity -> ResponseDTO
    public static UserAddressResponseDto toResponseDTO(UserAddress address) {
        UserAddressResponseDto dto = new UserAddressResponseDto();
        dto.setUserAddressId(address.getUserAddressId());
        dto.setDoorNo(address.getDoorNo());
        dto.setStreet(address.getStreet());
        dto.setLandmark(address.getLandmark());
        dto.setCity(address.getCity());
        dto.setDistrict(address.getDistrict());
        dto.setState(address.getState());
        dto.setPincode(address.getPincode());
        dto.setAddressType(address.getAddressType());
        return dto;
    }
}
