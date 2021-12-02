package com.definex

import com.definex.Event

/**
 * Created on December, 2021
 *
 * @author ege
 */
class Notification {

    //public static final String SLACK_MESSAGE_NEW = "Sending Slack Notification... with using anoth Notification";

    public static void init(script) {

        Event.subscribe("configuration-validation", false) { message ->
            //script.log.warning("configuration validation error has occurred: " + message)
            println "hello from init ${message}"
        }

        println "hello from init ${script} println"

    }
}
