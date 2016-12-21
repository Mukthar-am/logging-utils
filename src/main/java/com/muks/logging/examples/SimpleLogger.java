package com.muks.logging.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 300000511 on 20/12/16.
 *
 * Slf4j based logging explained here
 *
 */

public class SimpleLogger {
    static Logger log = LoggerFactory.getLogger(SimpleLogger.class.getName());

    public static void main(String[] args) {
        log.info("Started with the simple logger, logging.... ");
    }

}
