package com.codewitharya.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewitharya.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
