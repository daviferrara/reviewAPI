package com.dinning.review.repository;

import com.dinning.review.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByDisplayName(String displayName);

}
