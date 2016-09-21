package com.muks.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        //Set this before the logger start.
        System.setProperty("log1.name", "mkyong");
        System.setProperty("log2.name", "muks");

        App obj = new App();
        obj.start();

    }

    private void start() {
        logger.debug("------ Starting Ant------");
    }

}
