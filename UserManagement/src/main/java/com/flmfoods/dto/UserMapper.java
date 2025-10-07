package com.flmfoods.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.flmfoods.model.User;
import com.flmfoods.model.UserAddress;

public class UserMapper {

    // Convert RequestDTO -> Entity
    public static User toEntity(UserRequestDto dto) {
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setPhoneNum(dto.getPhoneNum());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        List<UserAddress> addresses = dto.getUserAddress().stream().map(addrDTO -> {
            UserAddress addr = new UserAddress();
            addr.setDoorNo(addrDTO.getDoorNo());
            addr.setStreet(addrDTO.getStreet());
            addr.setLandmark(addrDTO.getLandmark());
            addr.setCity(addrDTO.getCity());
            addr.setDistrict(addrDTO.getDistrict());
            addr.setState(addrDTO.getState());
            addr.setPincode(addrDTO.getPincode());
            addr.setAddressType(addrDTO.getAddressType());
            addr.setUser(user);
            return addr;
        }).collect(Collectors.toList());

        user.setUserAddress(addresses);
        return user;
    }

    // Convert Entity -> ResponseDTO
    public static UserResponseDto toResponseDTO(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        dto.setPhoneNum(user.getPhoneNum());
        dto.setEmail(user.getEmail());

        List<UserAddressResponseDto> addrList = user.getUserAddress().stream().map(addr -> {
            UserAddressResponseDto addrDto = new UserAddressResponseDto();
            addrDto.setUserAddressId(addr.getUserAddressId());
            addrDto.setDoorNo(addr.getDoorNo());
            addrDto.setStreet(addr.getStreet());
            addrDto.setLandmark(addr.getLandmark());
            addrDto.setCity(addr.getCity());
            addrDto.setDistrict(addr.getDistrict());
            addrDto.setState(addr.getState());
            addrDto.setPincode(addr.getPincode());
            addrDto.setAddressType(addr.getAddressType());
            return addrDto;
        }).collect(Collectors.toList());

        dto.setUserAddress(addrList);
        return dto;
    }
}
