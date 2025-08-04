// TransferRequest.java
package com.makinoEstudo.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record TransferRequest(UUID pagadorId, UUID recebedorId, BigDecimal valor) {}