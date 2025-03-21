package com.capgemini.Spring_Security_HandsOn.repository;

import com.capgemini.Spring_Security_HandsOn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String userName);
}
