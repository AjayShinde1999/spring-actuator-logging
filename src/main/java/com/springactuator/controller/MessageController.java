package com.springactuator.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private Log logger = LogFactory.getLog(MessageController.class);

    @GetMapping("/message")
    public String message() {
        logger.trace("TRACE Level log message");
        logger.debug("DEBUG Level log message");
        logger.info("INFO Level log message");
        logger.warn("WARN Level log message");
        logger.error("ERROR Level log message");
        return "W E L C O M E";
    }
}
