package com.definex

/**
 * Created on December, 2021
 *
 * @author ege
 */
class EventSubscription {

    private final boolean failPipeline;

    private final Closure closure;

    EventSubscription(boolean failPipeline, Closure closure) {
        this.failPipeline = failPipeline;
        this.closure = closure;
    }

    boolean getFailPipeline() {
        return failPipeline
    }

    Closure getClosure() {
        return closure
    }

}
