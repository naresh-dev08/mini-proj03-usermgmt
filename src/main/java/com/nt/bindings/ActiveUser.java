package com.nt.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser {

    private String email;
    private String tempPassword;
    private String newPassword;
    private String confPassword;

}
