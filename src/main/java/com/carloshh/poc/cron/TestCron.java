package com.carloshh.poc.cron;

import co.elastic.apm.api.CaptureTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestCron {
    private static final Logger LOG = LoggerFactory.getLogger(TestCron.class);

    @Scheduled(fixedRate = 10_000)
    @CaptureTransaction(value = "Data refresh")
    public void cron() {
        LOG.info("Log message from cron");
    }

}
