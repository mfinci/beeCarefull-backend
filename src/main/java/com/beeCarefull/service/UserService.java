package com.beeCarefull.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beeCarefull.repository.UserRepository;

@Service
public class UserService {
@Autowired UserRepository userRepository;
}
