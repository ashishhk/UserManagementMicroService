package com.labgalaxy.ms.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labgalaxy.ms.usermanagement.domain.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

}
