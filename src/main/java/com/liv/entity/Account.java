package com.liv.entity;

import com.liv.enams.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "account_details")
public class Account extends BaseEntity{
 private String name;
 private String address;
 private String country;
    private String state;
    private String city;
    private Integer aga;
    @Column(name = "postal_code")
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role= UserRole.USER;

    @OneToOne(mappedBy = "account")
    private User user;
}
