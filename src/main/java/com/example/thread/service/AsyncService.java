package com.example.thread.service;

import org.springframework.scheduling.annotation.Async;

public interface AsyncService {
    @Async("multithreadingExecutor")
    public void processTask(String payload);
}
