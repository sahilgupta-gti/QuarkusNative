package org.example.beans.impl;

import org.example.beans.SampleService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleServiceImpl implements SampleService {
    @Override
    public String getResponse() {
        return "response from SampleService";
    }
}
