package com.kt.donors.payment;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Payment {


    @Id
    @GeneratedValue
    private long id;
    private long userId;
    private Date startDate;
    private Date finishDate;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
