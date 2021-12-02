package com.definex

import com.definex.EventSubscription

/**
 * Created on December, 2021
 *
 * @author ege
 */
class Event {
    public static final String SLACK_MESSAGE_NEW = "Sending Slack Notification... with using anoth eveeent";

    private static Map<String, List<EventSubscription>> eventMap = new HashMap<>();


    /**
     * Subscribe to an event so that the provided closure will be executed when the event is published.
     * @param eventName Event name to subscribe to
     * @param failPipeline Fail the pipeline if any errors occur in the closure
     * @param closure Closure to execute
     */
    public static void subscribe(String eventName, boolean failPipeline, Closure closure) {
        //TODO
    }


}
