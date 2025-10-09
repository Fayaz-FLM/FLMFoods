package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignupDTO {
	
    private String userName;
    
    private String phoneNum;
    
    private String email;
    
    private String password;

}
