package it.develhope.Logging01.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicServices {

    @Autowired
    Environment environment;

    Logger logger = LoggerFactory.getLogger(BasicServices.class);

    public String welcome() {
        logger.debug("start welcome");

        logger.debug("end welcome");

        return "Welcome";

    }

    public String getPower() {
        try {
            logger.debug("Start power");
            int powerA = Integer.parseInt((environment.getProperty("myCustomVarTree.A")));
            int powerB = Integer.parseInt((environment.getProperty("myCustomVarTree.B")));
            return "A = " + powerA + " A power: " + powerA * powerA + ";     B= " + powerB + " B power = " + powerB * powerB;
        } finally {
            logger.debug("End power");
        }
    }

    public String getError() {
        logger.error("There is an error");
        return "Something is wrong";
    }
}
