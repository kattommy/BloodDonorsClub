package com.kt.donors.model;

import com.kt.donors.model.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Data
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToMany(mappedBy = "users")
    private Set<Payment> paymentsList;

    @OneToMany(mappedBy = "users")
    private Set<Donation> donationsConfirmList;

    private boolean statusAccount;

    @Column(length = 9)
    private String phoneNumber;

    @Column()
    private Role role;

}
