package com.nt.service;

import com.nt.bindings.ActiveUser;
import com.nt.bindings.LoginCredentials;
import com.nt.bindings.UserAccount;
import com.nt.entity.UserManager;

import java.util.List;

public interface IUserMgmtService {

    public String userRegister(UserManager userManager);
    public String activeUserAccount(ActiveUser activeUser);
    public String login(LoginCredentials loginCredentials);
    public List<UserAccount> userList();
    public UserAccount showUserByUserId(String userId);

}
