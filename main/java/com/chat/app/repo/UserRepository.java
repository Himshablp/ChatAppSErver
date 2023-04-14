package com.chat.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
