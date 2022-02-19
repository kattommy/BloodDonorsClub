package com.kt.donors.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String surname;

    @Column(length = 50, unique = true)
    private String email;

    @Column(unique = true)
    private String password;

    @CreatedDate()
    private Date attachmentDate = new Date();

    @OneToMany(mappedBy = "payments")
    private List<Payment> paymentsList;

    @OneToMany(mappedBy = "confirmations")
    private List<Donation> donationsConfirmList;

    @Column()
    private boolean statusAccount;

    @Column(length = 9)
    private String phoneNumber;

}
