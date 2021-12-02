package com.definex

import com.definex.EventSubscription

/**
 * Created on December, 2021
 *
 * @author ege
 */
class Event {
    private static Map<String, List<EventSubscription>> eventMap = new HashMap<>();

    /**
     * Execute the closures subscribed to the event.
     * It is guaranteed that all of the closures will be executed even when an error occurs in any of them.
     * @param script Pipeline script object
     * @param eventName Published event name
     * @param args Arguments that will be passed to the closure
     */
    public static void publish(script, String eventName, Object... args) {
        final List<EventSubscription> eventSubscriptionList = eventMap.get(eventName);
        if(eventSubscriptionList == null){
            return;
        }

        boolean failPipeline = false;

        // Loop over each event subscriber
        eventSubscriptionList.each{ eventSubscription ->

            // Loop over each arguments
            args.each{ arg ->
                final Closure closure = eventSubscription.getClosure();

                // Run closure with an argument
                closure(arg);
            }


            final boolean subscriptionFailPipeline = eventSubscription.getFailPipeline();

            script.log.warning("Subscription Fail pipeline: ${subscriptionFailPipeline}");

            // if it fails the pipeline wait for another subscribers to finish execution
            if(subscriptionFailPipeline){
                failPipeline = true;
            }
        }

        // After each subscriber finishes, fail the pipeline if one of them wants it to fail
        if(failPipeline){
            script.error "Pipeline failed!";
        }
    }


    /**
     * Subscribe to an event so that the provided closure will be executed when the event is published.
     * @param eventName Event name to subscribe to
     * @param failPipeline Fail the pipeline if any errors occur in the closure
     * @param closure Closure to execute
     */
    public static void subscribe(String eventName, boolean failPipeline, Closure closure) {
        final EventSubscription eventSubscription = new EventSubscription(failPipeline, closure);
        // Get relevant events List of EventSubscription
        List<EventSubscription> eventSubscriptionList = eventMap.get(eventName);
        // If list is empty, create a list
        if(eventSubscriptionList == null){
            eventSubscriptionList = new ArrayList<>();
        }
        // Add new subscriber to the list, and update the eventMap
        eventSubscriptionList.add(eventSubscription);
        eventMap.put(eventName, eventSubscriptionList)
    }


}
