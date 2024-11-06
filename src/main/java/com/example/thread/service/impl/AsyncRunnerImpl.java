package com.example.thread.service.impl;

import com.example.thread.service.AsyncRunner;
import com.example.thread.service.TaskProcess;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AsyncRunnerImpl implements AsyncRunner, CommandLineRunner {
    private final TaskProcess taskProcess;

    @Override
    public void run(String... args) throws Exception {
        taskProcess.processTask();
    }
}
