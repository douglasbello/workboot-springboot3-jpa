package com.douglasbello.cursospringboot.services;

import com.douglasbello.cursospringboot.entities.User;
import com.douglasbello.cursospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj =userRepository.findById(id);
        return obj.get();
    }
}
