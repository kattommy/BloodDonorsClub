package com.kt.donors.controller;

import com.kt.donors.model.User;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.RedirectView;


public interface ISeniorMemberController extends IMemberController {

    String getUsers(Model model);

    void getRegisteredUsers();

    void addNotification();

    void confirmUserDonation(User user);

    RedirectView postAddUser(User user);

    void confirmPayment(User user);

    void addDocument();

    void changeDocument();

    void removeUser(User user);

    void changeUserStatus();


}
