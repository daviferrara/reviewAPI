package com.dinning.review.repository;

import com.dinning.review.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    public Optional<Restaurant> findByName(String name);
}
