package com.nt.rest;

import com.nt.bindings.UserAccount;
import com.nt.service.IUserMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserManageAPI {

    public IUserMgmtService iUserMgmtService;

    @Autowired
    private UserManageAPI(IUserMgmtService iUserMgmtService ) {
        this.iUserMgmtService = iUserMgmtService;
    }

    @GetMapping("/userMail/{email}")
    public ResponseEntity<?> showUserByEmail(@PathVariable String email) {
        //use service class
        try {
            UserAccount userAccount = iUserMgmtService.showUserByUserId(email);
            return new ResponseEntity<UserAccount>(userAccount,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
        }

    }
}
