package com.kt.donors.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Donation {

    @Id
    @GeneratedValue
    private Long id;


    private String place;

    private Date donationDate;

    private Date inputDate;

    private int volumeOfBloodDonation;

    @ManyToOne(optional = false)
    private User users;

}
