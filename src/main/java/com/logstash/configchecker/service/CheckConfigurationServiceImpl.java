package com.logstash.configchecker.service;

import org.springframework.stereotype.Service;

@Service
public class CheckConfigurationServiceImpl implements CheckConfigurationService {

    @Override
    public boolean checkConfiguration(String configuration) {
        return false;
    }
}
