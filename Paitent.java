package com.example.HospitalManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Entity
//@Scope("prototype")
@Data
@Table(name = "patient")
public class Paitent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String middleName;
    private String lastName;

    private LocalDate dob;
    private String address;
    private String state;
    private String country;

    private String mobileNumber;
    private String relativeName;
    private String relativeMobile;
    private String illnessDetails;
   // private String password;
   // private String confirmPassword;

   @OneToOne
   @JoinColumn(name = "user_id")
   private User user;


}
