
package com.example.cricScore.repository;

import com.example.cricScore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find user by username (this ensures unique usernames)
    User findByUsername(String username);
}

