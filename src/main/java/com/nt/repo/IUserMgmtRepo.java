package com.nt.repo;

import com.nt.entity.UserManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserMgmtRepo extends JpaRepository<UserManager, Integer> {
}
