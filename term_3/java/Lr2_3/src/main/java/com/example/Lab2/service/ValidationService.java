package com.example.Lab2.service;

import com.example.Lab2.exception.UnsupportedCodeException;
import com.example.Lab2.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}
