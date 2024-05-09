package com.jaeguin.commerce.repository;

import com.jaeguin.commerce.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findUserById(@Param("id") String id);

    @Query("SELECT count(u) FROM User u WHERE u.id = :id")
    int findUserByIdString(String id);
}
