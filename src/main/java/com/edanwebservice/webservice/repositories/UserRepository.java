package com.edanwebservice.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edanwebservice.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
