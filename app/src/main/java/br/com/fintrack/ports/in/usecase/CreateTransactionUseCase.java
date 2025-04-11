package br.com.fintrack.ports.in.usecase;

import br.com.fintrack.domain.model.Transaction;

public interface CreateTransactionUseCase {
    Transaction createTransaction(Transaction transaction);
}
