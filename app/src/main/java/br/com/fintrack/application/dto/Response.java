package br.com.fintrack.application.dto;

import br.com.fintrack.domain.model.Error;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response <T> {
    private String message;
    private T data;
    private Error error;
}
