package com.definex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on December, 2021
 *
 * @author ege
 */
public class Event {

	public static final String SLACK_MESSAGE_NEW = "Sending Slack Notification... with using anoth";

	private static Map<String, List<com.definex.EventSubscription>> eventMap = new HashMap<>();

	/**
	 * Execute the closures subscribed to the event.
	 * It is guaranteed that all of the closures will be executed even when an error occurs in any of them.
	 * @param script Pipeline script object
	 * @param eventName Published event name
	 * @param args Arguments that will be passed to the closure
	 */
	/*
	public static void publish(script, String eventName, Object... args) {
		//TODO
	}

	 */

	/**
	 * Subscribe to an event so that the provided closure will be executed when the event is published.
	 * @param eventName Event name to subscribe to
	 * @param failPipeline Fail the pipeline if any errors occur in the closure
	 * @param closure Closure to execute
	 */
	/*
	public static void subscribe(String eventName, boolean failPipeline, Closure closure) {
		//TODO
	}

	 */
}
