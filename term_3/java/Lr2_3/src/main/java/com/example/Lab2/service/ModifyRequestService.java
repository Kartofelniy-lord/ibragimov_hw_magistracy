package com.example.Lab2.service;

import com.example.Lab2.model.Request;
import org.springframework.stereotype.Service;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
