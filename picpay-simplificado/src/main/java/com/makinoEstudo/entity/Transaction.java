package com.makinoEstudo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsContructor
@AllArgsContructor
public class Transaction {
    @Id
    @GenerateValue
    private UUID id;

    @ManyToOne
    private User pagador;

    @ManyToOne
    private User recebedor;

    @Column(nullable = false)
    private BigDecimal valor;

    private LocalDateTime data = LocalDateTime.now();
}