package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

@service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

     @Override
    public User create(User userToCreate){
        if(userRepository.existByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exist.");
        }
        return userRepository.save(userToCreate);
    }



}