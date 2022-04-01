package com.kt.donors.controller;

import com.kt.donors.model.User;

import java.util.List;

public interface ISeniorMemberController extends IMemberController {

    List<User> getUsers();

    void getRegisteredUsers();

    void addNotification();

    void confirmUserDonation(User user);

    void createAccount();

    void confirmPayment(User user);

    void addDocument();

    void changeDocument();

    void removeUser(User user);

    void changeUserStatus();


}
