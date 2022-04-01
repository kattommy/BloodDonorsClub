package com.kt.donors.controller;


import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;
import com.kt.donors.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/users")
public class UserController implements IAdminController {

    private UserService userService;


    @Override
    @GetMapping
    public List<User> getUsers(Model model) {
        List<User> users = (List<User>) userService.getAllUsers();
        model.addAttribute("users", users);
        return users;
    }

    @Override
    public void assignTheRole(User user, Role role) {
        userService.assignTheRole(user, role);
    }

    @Override
    public void changeUserStatus(User user, boolean newStatus) {
        userService.getUserById(user.getId()).setStatusAccount(newStatus);
    }

    @Override
    public void addDonationConfirm() {

    }

    @Override
    public void showNews() {

    }

    @Override
    public void getUserInfo() {

    }

    @Override
    public void getDonationStatistic() {

    }

    @Override
    public void changePassword() {

    }

    @Override
    public void changeEmail() {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void getRegisteredUsers() {

    }

    @Override
    public void addNotification() {

    }

    @Override
    public void confirmUserDonation(User user) {

    }

    @Override
    public void createAccount() {

    }

    @Override
    public void confirmPayment(User user) {

    }

    @Override
    public void addDocument() {

    }

    @Override
    public void changeDocument() {

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void changeUserStatus() {

    }
}
