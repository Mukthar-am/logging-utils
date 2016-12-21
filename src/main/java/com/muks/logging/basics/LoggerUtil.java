package com.muks.logging.basics;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    private static Logger log = null;

    public static Logger getLogger() {
        if (log != null) {
            return log;
        }
        else {
            log = LoggerFactory.getLogger(LoggerUtil.class.getName());
            return log;
        }
    }

}
