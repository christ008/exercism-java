public class LogLevels {
    
    public static String message(String logLine) {
        var message = logLine.substring(logLine.indexOf("]: ") + 3, logLine.length());
        return message.trim();
    }

    public static String logLevel(String logLine) {
        var level = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]: "));
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + (logLevel(logLine)) + ")";
    }
}
