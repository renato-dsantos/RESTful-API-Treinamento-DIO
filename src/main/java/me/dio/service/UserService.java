package me.dio.service;

public interface UserService{
    User findById(Long id);

    User create(User userToCreate);
    


}