package com.corinto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}