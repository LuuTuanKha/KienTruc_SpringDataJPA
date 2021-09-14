package com.iuh.luutkha.repo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<User, Integer> {

}
