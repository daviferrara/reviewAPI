package com.dinning.review.controller;

import com.dinning.review.model.User;
import com.dinning.review.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Iterable<User> getUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{displayName}")
    public User getUser(@PathVariable String displayName) {
        Optional<User> optionalUser = this.userRepository.findByDisplayName(displayName);
        if (optionalUser.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return optionalUser.get();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @PutMapping
    public User updateUser(@RequestAttribute String displayName,
                           @RequestAttribute Map<String, String> attributes) {
        Optional<User> optionalUser = this.userRepository.findByDisplayName(displayName);
        if (optionalUser.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        User user = optionalUser.get();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            setAtt(user, entry);
        }
        return this.userRepository.save(user);
    }

    private void setAtt (User user, Map.Entry<String, String> att){
        switch (att.getKey()) {
            case "city": user.setCity(att.getValue()); break;
            case "state": user.setState(att.getValue()); break;
            case "zipCode": user.setZipCode(att.getValue()); break;
            case "interestedPeanutAllergies":
                user.setInterestedPeanutAllergies(Boolean.getBoolean(att.getValue()));
                break;
            case "interestedEggAllergies":
                user.setInterestedEggAllergies(Boolean.getBoolean(att.getValue()));
                break;
            case "interestedDairyAllergies":
                user.setInterestedDairyAllergies(Boolean.getBoolean(att.getValue()));
                break;

        }
    }
    
}
