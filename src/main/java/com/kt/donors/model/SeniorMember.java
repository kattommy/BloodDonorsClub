package com.kt.donors.model;

public interface SeniorMember extends Member {

    void addNotification();

    void confirmUserDonation(User user);

    void createAccount();

    void confirmPayment(User user);

    void addDocument();

    void changeDocument();

    void removeUser(User user);

    void changeUserStatus();

}

//    void addDonationConfirm();
//
//    void showNews();
//
//    void getUserInfo();
//      void getDonationStatistic();
//      void changePassword();
//      void changeEmail();