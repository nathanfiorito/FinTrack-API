package br.com.fintrack.application.dto.transaction;

import br.com.fintrack.domain.model.Category;
import br.com.fintrack.domain.model.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private String description;
    private BigDecimal value;
    private TransactionType type;
    private Category category;
    private LocalDate date;
}
