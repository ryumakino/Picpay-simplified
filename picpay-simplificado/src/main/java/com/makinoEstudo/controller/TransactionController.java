package com.makinoEstudo.controller;

import com.makinoEstudo.dto.TransferRequest;
import com.makinoEstudo.entity.Transaction;
import com.makinoEstudo.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
@RequiredArgsContructor
public class TransactionController {
    private final TransactionService TransactionService;

    @PostMapping
    public ResponseEntity<Transaction> transferir(@RequestBody TransferRequest request) {
        Transaction t = transactionService.realizarTransferencia(
                request.pagadorId(), request.recebedorId(), request.valor()
        );
        return ResponseEntity.ok(t);
    }
}