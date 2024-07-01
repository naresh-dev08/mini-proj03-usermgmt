package com.nt.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {

    private String userName;
    private String email;
    private String gender = "Female";
    private Long aadhaarNumber;
    private Long mobileNumber;
    private LocalDate dob = LocalDate.now();


}
