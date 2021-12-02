import com.definex.Event

import javax.xml.bind.ValidationException

/**
 * Created on December, 2021
 *
 * @author ege
 */


def call(boolean failPipeline){
    try {
        log.info "Throwing an exception with failPipeline: ${failPipeline}";

        Exception exception;

        if(failPipeline){
            exception = new Exception("Test Validation Exception Thrown from action()")
        }
        else {
            exception = new ValidationException("Test Validation Exception Thrown from action()");
        }

        throw exception;
    } catch (ValidationException validationException) {
        log.debug "Publishing configuration-validation with ex.message: ${validationException.message}";
        Event.publish(this, "configuration-validation", validationException.message);
    } catch (Exception exception){
        log.debug "Publishing other-exceptions with exception.message: ${exception.message}";
        Event.publish(this, "other-exceptions", exception.message);
    }
}