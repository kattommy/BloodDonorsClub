package com.kt.donors.controller;

import com.kt.donors.model.User;

public interface ISeniorMemberController extends IMemberController {

    void addNotification();

    void confirmUserDonation(User user);

    void createAccount();

    void confirmPayment(User user);

    void addDocument();

    void changeDocument();

    void removeUser(User user);

    void changeUserStatus();

}
