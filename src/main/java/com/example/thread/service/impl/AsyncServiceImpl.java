package com.example.thread.service.impl;

import com.example.thread.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {
    @Override
    public void processTask(String payload) {
        log.info("Processing task: {}", payload);
        log.info("lenght of payload: {}", payload.length());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Task processed: {}", payload);
    }
}
