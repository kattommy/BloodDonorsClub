package com.kt.donors.service;

import com.kt.donors.model.User;
import com.kt.donors.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        return userRepository.getById(id);
    }

    public void updateUser(User userToSave){
        userRepository.save(userToSave);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public void createUser(User user) {
        if (user.getId() != null) {
            throw new IllegalArgumentException("Użytkownik o podanym ID już istnieje !!!");
        }
        updateUser(user);
    }


}
