package br.com.fintrack.adapters.out.persistence.repository;

import br.com.fintrack.adapters.out.persistence.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<TransactionEntity, UUID> {
}
