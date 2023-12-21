package com.example.Lab2.service;

import com.example.Lab2.model.Request;
import com.example.Lab2.model.Systems;
import org.springframework.context.annotation.Primary;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Primary
@Service
public class ModifySourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("New source!!!");

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        long time = System.currentTimeMillis();
        String path = "http://localhost:8084/feedback?time=" + time;
        System.out.println(path);
        new RestTemplate().exchange(path,
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<Object>() {
                });
    }
}
