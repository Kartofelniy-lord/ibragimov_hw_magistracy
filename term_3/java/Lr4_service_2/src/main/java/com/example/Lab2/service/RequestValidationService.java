package com.example.Lab2.service;

import com.example.Lab2.exception.UnsupportedCodeException;
import com.example.Lab2.exception.ValidationFailedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Slf4j
@Service
public class RequestValidationService implements ValidationService{
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if(bindingResult.getFieldValue("uid").equals("123")){
            log.error("bindingResult error: {}", bindingResult.getFieldError().toString());
            throw new UnsupportedCodeException(bindingResult.getFieldError().toString());
        }
        if(bindingResult.hasErrors()){
            log.error("bindingResult error: {}", bindingResult.getFieldError().toString());
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
