package br.com.fintrack.application.dto.transaction;

import br.com.fintrack.domain.model.enums.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    @NotBlank(message = "The DESCRIPTION field must be not null or empty.")
    private String description;
    @Positive(message = "The VALUE field must be positive or higher than 0.")
    private BigDecimal value;
    @NotBlank(message = "The TYPE field must be not null or empty.")
    private TransactionType type;
    @NotBlank(message = "The CATEGORY field must be not null or empty.")
    private String category;
    @PastOrPresent(message = "The DATE field must be past or present.")
    private LocalDate date;
}
