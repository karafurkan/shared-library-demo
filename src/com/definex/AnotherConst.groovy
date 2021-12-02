package com.definex

import com.definex.Constants

import java.util.logging.Logger
/**
 * Created on December, 2021
 *
 * @author ege
 */
class AnotherConst {

    private static Logger logger = Logger.getLogger(AnotherConst.getName())

    public static final String SLACK_MESSAGE_NEW = "Sending Slack Notification... with using another class static ${Constants.EMAIL_MESSAGE}"


    public static void deneme(){
        script.log.warning("inside deneme() inside AnotherConst class --> configuration validation error has occurred: ")

        logger.info('Hello from a Job DSL script!')
        //println "aaaaaaaaaaaaaaaaaa"
    }

}
