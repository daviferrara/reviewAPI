package com.dinning.review.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_reviewer")
public class User {


    @Id
    @Column(name = "display_name")
    @Getter
    @Setter
    private String displayName;

    @Getter
    @Setter
    @Column
    private String city;

    @Getter
    @Setter
    @Column
    private String state;

    @Getter
    @Setter
    @Column(name = "zip_code")
    private String zipCode;

    @Getter
    @Setter
    @Column(name = "interested_peanut_allergies")
    private boolean interestedPeanutAllergies;

    @Getter
    @Setter
    @Column(name = "interested_egg_allergies")
    private boolean interestedEggAllergies;

    @Getter
    @Setter
    @Column(name = "interested_dairy_allergies")
    private boolean interestedDairyAllergies;
}
