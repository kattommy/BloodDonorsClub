package com.kt.donors.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private String email;
    private String password;
    private Date attachmentDate;
    @OneToMany
    private List<Payment> paymentsList;
    @OneToMany
    private List<Donation> donationsConfirmList;
    private boolean statusAccount;
    private String phoneNumber;

}
