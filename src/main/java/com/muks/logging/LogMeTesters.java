package com.muks.logging;

import org.slf4j.Logger;

/**
 * Created by 15692 on 21/09/16.
 */

public class LogMeTesters {

    public static class Test1 {
        Logger logger = LoggerUtil.getLogger();

        void method1() {
            logger.debug("Test1 - class");
        }


    }

    public static class Test2 {
        Logger logger = LoggerUtil.getLogger();

        void method2() {
            logger.debug("test-class - 2");
        }

    }


    public static void main(String[] args) {
        new Test1().method1();
        new Test2().method2();
    }
}
