package com.kt.donors.files;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Donation {

    @Id
    @GeneratedValue
    private long id;
    private String place;
    private Date donationDate;
    private Date inputDate;
    private int volumeOfBloodDonation;





}
