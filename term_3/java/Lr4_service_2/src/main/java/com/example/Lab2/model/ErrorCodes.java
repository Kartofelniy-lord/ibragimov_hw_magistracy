package com.example.Lab2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCodes {

    EMPTY(""),
    VALIDATION_EXCEPTION("Ошибка валидации"),
    UNKNOWN_EXCEPTION("Не поддерживаемая ошибка");

    private final String code;

    ErrorCodes(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
