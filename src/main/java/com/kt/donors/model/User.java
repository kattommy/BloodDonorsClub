package com.kt.donors.model;

import com.kt.donors.files.Donation;
import com.kt.donors.payment.Payment;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.util.Date;


@Component
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
    private Payment payment;
    private Donation donationConfirm;
    private boolean status;
    private String phoneNumber;


    void changeEmail() {

    }

    void changePhoneNumber() {

    }


}
