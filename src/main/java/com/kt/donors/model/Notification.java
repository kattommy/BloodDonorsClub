package com.kt.donors.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Notification {

    @Id
    @GeneratedValue
    private Long id;

    private String header;

    private String content;

    private Date additionDate;

}
