package com.felix.crud.repositories;

import com.felix.crud.dto.User;
import com.felix.crud.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
