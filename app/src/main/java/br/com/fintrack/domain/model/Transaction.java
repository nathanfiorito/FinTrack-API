package br.com.fintrack.domain.model;

import br.com.fintrack.domain.model.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private String description;
    private BigDecimal value;
    private TransactionType type;
    private Category category;
    private LocalDate date;
    private User user;
}
