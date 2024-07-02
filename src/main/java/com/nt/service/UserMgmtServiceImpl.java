package com.nt.service;

import com.nt.bindings.ActiveUser;
import com.nt.bindings.LoginCredentials;
import com.nt.bindings.UserAccount;
import com.nt.entity.UserManager;
import com.nt.repo.IUserMgmtRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMgmtServiceImpl implements IUserMgmtService {

    public IUserMgmtRepo iUserMgmtRepo;

    @Autowired
    public UserMgmtServiceImpl(IUserMgmtRepo iUserMgmtRepo){
        this.iUserMgmtRepo = iUserMgmtRepo;
    }

    @Override
    public String userRegister(UserManager userManager) {
        return null;
    }

    @Override
    public String activeUserAccount(ActiveUser activeUser) {
        return null;
    }

    @Override
    public String login(LoginCredentials loginCredentials) {
        return null;
    }

    @Override
    public List<UserAccount> userList() {
        return null;
    }

    @Override
    public UserAccount showUserByUserId(String email) {

        UserManager userManager = iUserMgmtRepo.findByEmail(email);
        UserAccount userAccount = new UserAccount();
        if (userManager != null) {
            BeanUtils.copyProperties(userManager, userAccount);
            return userAccount;
        } else {
            return null;
        }
    }
}
