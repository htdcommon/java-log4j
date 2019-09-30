package com.sensetime.log4j;

import org.apache.log4j.Logger;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        logger.info("hello info");

        logger.debug("hello debug");


    }
}
