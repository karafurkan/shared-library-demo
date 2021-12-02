

/**
 * Created on December, 2021
 *
 * @author ege
 */


def debug(String logMessage){
    print("DEBUG", logMessage)
}

def info(String logMessage){
    print("INFO ${this.stage}", logMessage)
}

def warning(String logMessage){
    print("WARNING", logMessage)
}

def error(String logMessage){
    print("ERROR", logMessage)
}

def print(String logLevel, String logMessage){
    Date now = new Date()
    final String formattedDate = now.format("dd/MM/yyyy-HH:mm:ss.SSS", TimeZone.getTimeZone('UTC'));
    println "${formattedDate} - ${logLevel}: ${logMessage}"
}