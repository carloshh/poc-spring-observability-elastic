package com.carloshh.poc.api;

import co.elastic.apm.api.ElasticApm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/test")
    public void create() {
        ElasticApm.currentTransaction().setName("Calculation process");
        LOG.info("Calculation process has started");
    }

}
