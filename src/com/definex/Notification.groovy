package com.definex

import com.definex.Event

/**
 * Created on December, 2021
 *
 * @author ege
 */
class Notification {
    public static void init(script) {
        Event.subscribe("configuration-validation", false) { message ->
            script.log.warning("configuration validation error has occurred: " + message)
        }

    }
}
