public class LogLine {

    String parsedLogLine = "";

    public LogLine(String logLine) {
        this.parsedLogLine = logLine;
    }

    public LogLevel getLogLevel() {
        var parsedLogLevel = parsedLogLine.substring(1, 4);
        return switch (parsedLogLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        var parsedLogMessage = parsedLogLine.substring(7);
        return getLogLevel().code() + ":" + parsedLogMessage;
    }
}
