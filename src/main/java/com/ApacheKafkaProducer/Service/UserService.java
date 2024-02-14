package com.ApacheKafkaProducer.Service;

import com.ApacheKafkaProducer.Model.User;
import com.ApacheKafkaProducer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User createUser(User user){
        return userRepository.save(user);
    }


    @Transactional
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
