package com.beeCarefull.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beeCarefull.service.UserService;

@RestController
@RequestMapping
public class UserController {
@Autowired UserService userService;
}
