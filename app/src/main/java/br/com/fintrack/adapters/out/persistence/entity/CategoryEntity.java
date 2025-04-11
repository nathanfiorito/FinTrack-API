package br.com.fintrack.adapters.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    private UUID id;
    private String name;
    private String description;
}
