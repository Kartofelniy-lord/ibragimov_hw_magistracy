package com.example.Lab2.service;

import com.example.Lab2.model.Response;
import com.example.Lab2.util.DateTimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService {

    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        log.info("new system time: {}\n response: {}", DateTimeUtil.getCustomFormat().format(new Date()), response);

        return response;
    }
}
