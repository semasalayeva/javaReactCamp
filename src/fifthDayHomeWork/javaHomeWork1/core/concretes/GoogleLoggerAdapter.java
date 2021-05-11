package fifthDayHomeWork.javaHomeWork1.core.concretes;

import fifthDayHomeWork.javaHomeWork1.core.abstracts.LoggerService;
import fifthDayHomeWork.javaHomeWork1.googleLogger.GoogleLogger;

public class GoogleLoggerAdapter implements LoggerService {
    @Override
    public void send(String message) {
        GoogleLogger googleLogger = new GoogleLogger();
        googleLogger.send(message);
    }
}
