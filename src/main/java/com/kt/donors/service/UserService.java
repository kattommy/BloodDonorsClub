package com.kt.donors.service;

import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;
import com.kt.donors.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public User getUserById(Long id){
      return userRepository.getById();
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
        if (user.getId() != null) {
            throw new IllegalArgumentException("Użytkownik o podanym ID już istnieje !!!");
        }
        updateUser(user);
    }

    public User loadUserBySurname(String surname) throws UsernameNotFoundException {
        return userRepository.findBySurname(surname).orElseThrow(() -> new UsernameNotFoundException("Brak użytkownika o nazwisku: " + surname));
    }

    public void assignTheRole(User user, Role newRole) {
        userRepository.getById(user.getId()).setRole(newRole);
    }
}
