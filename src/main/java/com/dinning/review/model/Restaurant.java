package com.dinning.review.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="restaurant")
public class Restaurant {

    @Setter @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @Getter
    @Column
    private String name;

    @Setter
    @Getter
    @Column
    private String address;

    @Setter
    @Getter
    @Column
    private String phone;

    @Setter
    @Getter
    @Column
    private String email;

    @Setter
    @Getter
    @Column
    private String city;

    @Setter
    @Getter
    @Column
    private String state;

    @Setter
    @Getter
    @Column
    private String description;

    @Setter
    @Getter
    @Column
    private Integer overallScore;

}
