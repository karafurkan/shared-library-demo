import com.definex.Event

/**
 * Created on December, 2021
 *
 * @author ege
 */


def call(){
    //script.log.warning("inside action configuration validation error has occurred: ")
    println "deneme action"

    try {
        println "throwing an exception"
        Notification.asd()
        //throw new Exception()
    } catch (Exception ex) {

        println "ex.message: ${ex.message}"
        println "publishing..."
        Event.publish(this, "configuration-validation", ex.message)
    }
}