package com.muks.logging.basics;


import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;

/**
 * Created by 15692 on 21/09/16.
 *
 * =>
 *
 */
public class LogMaster {
//    private static Logger log = LoggerFactory.getLogger(LogMaster.class.getName());
//    private static Logger logger;
//
//    public static Logger getLogger() {
//        if (log != null) {
//            return log;
//        }
//        else {
//            log = LoggerFactory.getLogger(LogMaster.class.getName());
//            return log;
//        }
//    }


    public static void main(String[] args) {
        Logger foo = createLoggerFor("foo", "/Users/15692/Downloads/foo.log");
        Logger bar = createLoggerFor("bar", "/Users/15692/Downloads/bar.log");
        foo.debug("test");
        bar.debug("bar");
    }

    private static Logger createLoggerFor(String str, String file) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        PatternLayoutEncoder ple = new PatternLayoutEncoder();

        ple.setPattern("%date %level [%thread] %logger{10} [%file:%line] %msg%n");
        ple.setContext(lc);
        ple.start();
        FileAppender<ILoggingEvent> fileAppender = new FileAppender<>();
        fileAppender.setFile(file);
        fileAppender.setEncoder(ple);
        fileAppender.setContext(lc);
        fileAppender.start();

        Logger logger = (Logger) LoggerFactory.getLogger(str);

        logger.addAppender(fileAppender);
        logger.setLevel(Level.DEBUG);
        logger.setAdditive(false); /* set to true if root should log too */



        return logger;
    }
}