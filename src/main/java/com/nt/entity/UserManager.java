package com.nt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "JRTP_USER_MANAGER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;
    @Column(length = 20)
    private String usernName;
    @Column(length = 20)
    private String password;
    @Column(length = 30)
    private String email;
    private Long mobileNumber;
    private Long aadhaarNumber;
    @Column(length = 10)
    private String gender;
    private LocalDate dob;
    @Column(length = 10)
    private String active_SW;

    //MetaData
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdOn;
    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime updatedOn;
    @Column(length = 20)
    private String createdBy;
    @Column(length = 20)
    private String UpdatedBy;
}
