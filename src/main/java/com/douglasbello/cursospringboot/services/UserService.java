package com.douglasbello.cursospringboot.services;

import com.douglasbello.cursospringboot.entities.User;
import com.douglasbello.cursospringboot.repositories.UserRepository;
import com.douglasbello.cursospringboot.services.exceptions.ResourceNotFoundException;
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
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id,User obj) {
        User entity = userRepository.getReferenceById(id); // ele retorna o obj com o id passado sem acessar o bd, ou
        // seja, não efetua nenhuma operação com o bd.

        updateData(entity,obj);

        return userRepository.save(entity);

    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }
}
