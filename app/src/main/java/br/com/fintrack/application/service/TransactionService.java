package br.com.fintrack.application.service;

import br.com.fintrack.adapters.out.persistence.mapper.TransactionMapper;
import br.com.fintrack.adapters.out.persistence.repository.TransactionRepositoryAdapter;
import br.com.fintrack.domain.model.Transaction;
import br.com.fintrack.ports.in.usecase.CreateTransactionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService implements CreateTransactionUseCase {
    private final TransactionMapper transactionMapper;
    private final TransactionRepositoryAdapter transactionRepositoryAdapter;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        var transactionEntity = transactionRepositoryAdapter.save(transaction);
        return transactionMapper.toDomain(transactionEntity);
    }
}
