package com.kt.donors.controller;


import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;
import com.kt.donors.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/users")
public class UserController implements IAdminController {

    private UserService userService;


    @Override
    @PostMapping("/addUser")
    public RedirectView postAddUser(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return new RedirectView("users");
    }
    @GetMapping("/addUser")
    public String getAddUser(){
        return "addUser";
    }

    @Override
    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public String getUsers(Model model) {
        List<User> users = (List<User>) userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
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
    public void getRegisteredUsers() {

    }

    @Override
    public void addNotification() {

    }

    @Override
    public void confirmUserDonation(User user) {

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
