package br.com.fintrack.ports.out.persistence.port;

import br.com.fintrack.adapters.out.persistence.entity.TransactionEntity;
import br.com.fintrack.domain.model.Transaction;

public interface TransactionRepositoryPort {
    TransactionEntity save(Transaction transaction);
}
