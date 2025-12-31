package com.ust.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.UserEntity;
import com.ust.demo.repository.userRepository;

@Service
public class userService {
    @Autowired
    private userRepository ur;
    public UserEntity addUser(UserEntity userEntity){
        return ur.save(userEntity);

    }
    public List<UserEntity> findall(){
        return ur.findAll();
        
    }
    public void deleteUser(Long id){
        ur.deleteById(id);
    }

}
