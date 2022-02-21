package com.kt.donors.model;

import com.kt.donors.model.enums.PaymentValue;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Payment {


    @Id
    @GeneratedValue
    private long id;

    private Date dateAdded;

    private PaymentValue paymentValue;

    @Column(length = 4)
    private String paymentForYear;

    @ManyToOne(optional = false)
    private User users;

}
