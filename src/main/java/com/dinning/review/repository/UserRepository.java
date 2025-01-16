package com.dinning.review.repository;

import com.dinning.review.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByDisplayName(String displayName);

}
