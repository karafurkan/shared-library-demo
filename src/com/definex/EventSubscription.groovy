package com.definex

/**
 * Created on December, 2021
 *
 * @author ege
 */
class EventSubscription {

    public final boolean failPipeline;

    public final Closure closure;

    EventSubscription(boolean failPipeline, Closure closure){
        this.failPipeline=failPipeline;
        this.closure=closure;
    }

}
