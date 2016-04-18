package com.logstash.configchecker.controller;

import com.logstash.configchecker.service.CheckConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckConfigurationController {

    @Autowired
    private CheckConfigurationService checkConfigurationService;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST, consumes = "text/plain")
    public boolean checkConfiguration(@RequestBody String configuration) {
        return checkConfigurationService.checkConfiguration(configuration);
    }


}
