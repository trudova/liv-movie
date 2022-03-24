package com.liv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Location extends BaseEntity{
    private String name;
    private BigDecimal latitude;
    private BigDecimal langtitude;
    private Integer postalCode;
    private  String country;
    private String state;
    private String city;
    private String address;

    public Location(String name, BigDecimal latitude, BigDecimal langtitude, Integer postalCode, String country, String state, String city, String address) {
        this.name = name;
        this.latitude = latitude;
        this.langtitude = langtitude;
        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
    }
}
