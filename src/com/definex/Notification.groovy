package com.definex

import com.definex.Event

/**
 * Created on December, 2021
 *
 * @author ege
 */
class Notification {
    public static void initConfigurationValidation(script) {
        Event.subscribe("configuration-validation", false) { message ->
            script.log.warning("configuration validation error has occurred: " + message)
        }
        script.log.info("configuration-validation event subscribed!")
    }
    public static void initOtherExceptions(script) {
        Event.subscribe("other-exceptions", true) { message ->
            script.log.error("configuration validation error has occurred: " + message)
        }
        script.log.info("other-exceptions event subscribed!")
    }
}
