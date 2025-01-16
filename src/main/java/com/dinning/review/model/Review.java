package com.dinning.review.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="review")
public class Review {

    @Id
    @Column(name="id")
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "display_name", referencedColumnName = "display_name")
    private User user;

    @Column(name = "peanut_score")
    @Getter
    @Setter
    private Integer peanutScore;

    @Column(name = "egg_score")
    @Getter
    @Setter
    private Integer eggScore;

    @Column(name = "dairyScore")
    @Getter
    @Setter
    private Integer dairyScore;


    @Getter
    @Setter
    @Column(name ="comment")
    private String comment;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;

    @Getter @Setter
    @Column
    @Enumerated(EnumType.STRING)
    private ReviewStatusEnum status;

}
