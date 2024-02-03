package com.codewithisuka.fullstackbackend.exception;

import com.codewithisuka.fullstackbackend.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
