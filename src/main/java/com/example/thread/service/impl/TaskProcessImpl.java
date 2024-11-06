package com.example.thread.service.impl;

import com.example.thread.service.AsyncService;
import com.example.thread.service.TaskProcess;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskProcessImpl implements TaskProcess {
    private final AsyncService asyncService;

    @Override
    public void processTask() {
        log.info("Start processing task");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Bean");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        fruits.add("Honeydew");
        fruits.add("Jackfruit");
        fruits.add("Kiwi");
        log.info("start processing {} tasks", fruits.size());
        for (String payload : fruits) {
            asyncService.processTask(payload);
        }
        log.info("End processing task");
    }
}
