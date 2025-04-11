package br.com.fintrack.adapters.out.persistence.mapper;

import br.com.fintrack.adapters.out.persistence.entity.TransactionEntity;
import br.com.fintrack.application.dto.transaction.TransactionRequest;
import br.com.fintrack.application.dto.transaction.TransactionResponse;
import br.com.fintrack.domain.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    Transaction toDomain(TransactionRequest transactionRequest);
    Transaction toDomain(TransactionEntity transactionEntity);
    TransactionResponse toResponse(Transaction transaction);
    TransactionEntity toEntity(Transaction transaction);
}
