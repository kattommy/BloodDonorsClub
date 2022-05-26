package com.kt.donors.controller;

import com.kt.donors.model.User;
import com.kt.donors.model.enums.Role;


public interface IAdminController extends ISeniorMemberController {

    //abstract String getUsers(Model model);

    void assignTheRole(User user, Role newRole);

    void changeUserStatus(User user, boolean newStatus);

}
