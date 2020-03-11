/**
 * This class uses for Log4j. Write to console and file.
 * Uses simply, example:
 * ApplicationLogger.LOGGER.info("Triangle area: " + shape.area());
 *
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
 */


package com.myproject.lection08;

import org.apache.log4j.Logger;

public class ApplicationLogger {
    public final static Logger LOGGER = Logger.getLogger(ApplicationLogger.class);
}

