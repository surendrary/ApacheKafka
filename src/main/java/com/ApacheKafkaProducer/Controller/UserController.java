package com.ApacheKafkaProducer.Controller;


import com.ApacheKafkaProducer.Model.User;
import com.ApacheKafkaProducer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        System.out.println("Post");
        return userService.createUser(user);
    }

    @GetMapping("/userlist")
    public String listUser(Model model){
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList",userList);
        return "userlist";
    }

}
