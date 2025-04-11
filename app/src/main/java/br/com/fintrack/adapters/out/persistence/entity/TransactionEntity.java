package br.com.fintrack.adapters.out.persistence.entity;

import br.com.fintrack.domain.model.enums.TransactionType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transactions")
public class TransactionEntity {
    @Id
    private UUID id;
    private String description;
    @Column(name = "transaction_value")
    private BigDecimal value;
    @Column(name = "transaction_date")
    private LocalDate date;
    @Column(name = "transaction_type")
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String category;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
}
