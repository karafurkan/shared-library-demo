import com.definex.Event

import javax.xml.bind.ValidationException

/**
 * Created on December, 2021
 *
 * @author ege
 */


def call(boolean failPipeline) {
    try {
        log.info "Throwing an exception with failPipeline: ${failPipeline}";


        Exception exception;
        final String exceptionMessage = "%s Thrown from action(${failPipeline})"

        if (failPipeline) {
            exception = new Exception(String.format(exceptionMessage, "Test Validation Exception"))
        } else {
            exception = new ValidationException(String.format(exceptionMessage, "Test Exception"));
        }

        throw exception;
    } catch (ValidationException validationException) {
        log.debug "Publishing configuration-validation with ex.message: ${validationException.message}";
        Event.publish(this, "configuration-validation", validationException.message);
    } catch (Exception exception) {
        log.debug "Publishing other-exceptions with exception.message: ${exception.message}";
        Event.publish(this, "other-exceptions", exception.message);
    }
}