package com.felix.crud.service;

import com.felix.crud.dto.User;
import com.felix.crud.entities.UserEntity;
import com.felix.crud.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public  UserEntity saveUser(UserEntity user){
        return userRepository.save(user);
    }
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}

