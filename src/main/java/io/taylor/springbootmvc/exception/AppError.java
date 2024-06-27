package io.taylor.springbootmvc.exception;

import lombok.Data;

@Data
public class AppError {
    private String message;
    private String reason;
}
