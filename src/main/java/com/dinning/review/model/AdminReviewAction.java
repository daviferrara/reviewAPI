package com.dinning.review.model;

import lombok.Getter;
import lombok.Setter;

public class AdminReviewAction {

    @Getter @Setter
    private Boolean accepted;

    @Getter @Setter
    private Review review;
}
