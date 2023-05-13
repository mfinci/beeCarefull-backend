package com.beeCarefull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beeCarefull.domain.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
