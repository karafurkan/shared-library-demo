

/**
 * Created on December, 2021
 *
 * @author ege
 */

// Log levels
def debug(String logMessage){
    print("DEBUG", logMessage)
}

def info(String logMessage){
    print("INFO", logMessage)
}

def warning(String logMessage){
    print("WARNING", logMessage)
}

def error(String logMessage){
    print("ERROR", logMessage)
}

// Print the logs with specific format
def print(String logLevel, String logMessage){
    final Date now = new Date()
    final String formattedDate = now.format("dd/MM/yyyy-HH:mm:ss.SSS", TimeZone.getTimeZone('UTC'));
    println "${formattedDate} - ${logLevel}: ${logMessage}"
}