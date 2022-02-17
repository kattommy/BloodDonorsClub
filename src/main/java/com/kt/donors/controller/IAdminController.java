package com.kt.donors.controller;

import com.kt.donors.model.User;

public interface IAdminController extends ISeniorMemberController {

    void assignTheRole(User user);

    void changeUserStatus(User user);

}
