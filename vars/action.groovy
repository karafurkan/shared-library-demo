import com.definex.Event

import javax.xml.bind.ValidationException

/**
 * Created on December, 2021
 *
 * @author ege
 */


def call(){
    try {
        println "throwing an exception";
        ValidationException validationException = new ValidationException("Test Validation Exception Thrown from action()");
        throw validationException;
    } catch (ValidationException ex) {
        println "ex.message: ${ex.message}";
        println "publishing...";
        Event.publish(this, "configuration-validation", ex.message);
    }
}