package org.example.beans.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.beans.SampleService;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@ApplicationScoped
public class SampleServiceImpl implements SampleService {
    SampleServiceImpl() {
        log.info("SampleServiceImpl constructor called: {}", this);
    }

    @Override
    public Map<String, String> getResponse() {
        Map<String, String> map = new HashMap<>();
        map.put("response", this.getClass().getName());
        map.put("timestamp", LocalDateTime.now().toString());
        return map;
    }
}
