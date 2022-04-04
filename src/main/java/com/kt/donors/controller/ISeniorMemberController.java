package com.kt.donors.controller;

import com.kt.donors.model.User;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

public interface ISeniorMemberController extends IMemberController {

    List<User> getUsers();

    void getRegisteredUsers();

    void addNotification();

    void confirmUserDonation(User user);

    RedirectView createAccount(User user);

    void confirmPayment(User user);

    void addDocument();

    void changeDocument();

    void removeUser(User user);

    void changeUserStatus();


}
