package com.example.Lab2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorMessage {
    EMPTY(""),
    VALIDATION("Ошибка валидации"),
    UNKNOWN("Не поддерживаемая ошибка");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @JsonValue
    public String getMessage() {
        return message;
    }
}
