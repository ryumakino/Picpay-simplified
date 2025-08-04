package com.makinoEstudo.service;

import com.makinoEstudo.entity.Transaction;
import com.makinoEstudo.entity.User;
import com.makinoEstudo.repository.TransactionRepository;
import com.makinoEstudo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final UserRepository userRepository;
    private final TransactionRepository transactionRepository;
    private final RestTemplate restTemplate;

    @Transactional
    public Transaction realizarTransferencia(UUID pagadorId, UUID recebedorId, BigDecimal valor) {
        User pagador = userRepository.findById(pagadorId).orElseThrow(() -> new RuntimeException("Pagador não encontrado!"));
        User recebedor = userRepository.findById(recebedorId).orElseThrow(() -> new RuntimeException("Pagador não encontrado!"));

    }
}