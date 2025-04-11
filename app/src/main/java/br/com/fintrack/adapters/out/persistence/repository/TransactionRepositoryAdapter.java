package br.com.fintrack.adapters.out.persistence.repository;

import br.com.fintrack.adapters.out.persistence.entity.TransactionEntity;
import br.com.fintrack.adapters.out.persistence.mapper.TransactionMapper;
import br.com.fintrack.domain.model.Transaction;
import br.com.fintrack.ports.out.persistence.port.TransactionRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionRepositoryAdapter implements TransactionRepositoryPort {
    private final TransactionMapper transactionMapper;
    private final TransactionRepository transactionRepository;

    @Override
    public TransactionEntity save(Transaction transaction) {
        return transactionRepository.save(transactionMapper.toEntity(transaction));
    }
}
