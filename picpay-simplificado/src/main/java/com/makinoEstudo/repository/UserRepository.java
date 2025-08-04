package com.makinoEstudo.repository;

import com.makinoEstudo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Opitional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Opitional<User> findByCpf(String cpf);

    boolean existsByCpf(String cpf);
}