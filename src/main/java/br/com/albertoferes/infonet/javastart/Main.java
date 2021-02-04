package br.com.albertoferes.infonet.javastart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        testLogging();
    }

    public static void testLogging() {
        LOG.debug("Hello World =)");
    }
}
