package com.makinoEstudo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsContructor
@AllArgsContructor
public class User {
    @Id
    @GenerateValue
    private UUID id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String tipo; // "comum" ou "lojista"

    @Column(nullable = false)
    private BigDecimal saldo = BigDecimal.ZERO;

    
}