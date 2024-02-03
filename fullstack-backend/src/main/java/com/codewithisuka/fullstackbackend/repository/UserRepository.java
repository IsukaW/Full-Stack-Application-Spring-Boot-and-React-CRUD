package com.codewithisuka.fullstackbackend.repository;


import com.codewithisuka.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
