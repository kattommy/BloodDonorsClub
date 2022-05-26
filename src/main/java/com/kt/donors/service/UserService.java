package com.kt.donors.service;

import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;
import com.kt.donors.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.requireNonNull;


@Service
@AllArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public User getUserById(Long id){
      return userRepository.getById(id);
    }
    public User getUserByEmail(String email){
        return userRepository.getUserByEmail( email );
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
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
        requireNonNull(user);
        if (getUserByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email already exist!");
        }

        user.setRole(Role.SENIOR_MEMBER);
        updateUser(user);

    }

    public void assignTheRole(User user, Role newRole) {
        userRepository.getById(user.getId()).setRole(newRole);
    }
}
