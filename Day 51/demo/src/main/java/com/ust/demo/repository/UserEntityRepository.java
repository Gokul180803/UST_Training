package com.ust.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.userEntity.user;
@Repository
public interface UserEntityRepository extends  JpaRepository<user, Long> {
 
    Optional<user>findByUserName(String userName);

}
