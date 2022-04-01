package com.kt.donors.controller;

import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;
import org.springframework.ui.Model;

import java.util.List;

public interface IAdminController extends ISeniorMemberController {

    abstract List<User> getUsers(Model model);

    void assignTheRole(User user, Role newRole);

    void changeUserStatus(User user, boolean newStatus);

}
