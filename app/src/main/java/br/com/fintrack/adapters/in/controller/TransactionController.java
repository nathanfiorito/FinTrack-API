package br.com.fintrack.adapters.in.controller;

import br.com.fintrack.adapters.out.persistence.mapper.TransactionMapper;
import br.com.fintrack.application.dto.Response;
import br.com.fintrack.application.dto.transaction.TransactionRequest;
import br.com.fintrack.application.dto.transaction.TransactionResponse;
import br.com.fintrack.ports.in.usecase.CreateTransactionUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionMapper transactionMapper;
    private final CreateTransactionUseCase createTransactionUseCase;

    @PostMapping
    public ResponseEntity<Response<TransactionResponse>> createTransaction(@RequestBody @Valid TransactionRequest transactionRequest){
        var transaction = createTransactionUseCase.createTransaction(transactionMapper.toDomain(transactionRequest));
        var response = Response.<TransactionResponse>builder()
                .data(transactionMapper.toResponse(transaction))
                .message("Transaction created successfully.")
                .build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
