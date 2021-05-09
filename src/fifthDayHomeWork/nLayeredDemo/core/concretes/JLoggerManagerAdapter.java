package fifthDayHomeWork.nLayeredDemo.core.concretes;

import fifthDayHomeWork.nLayeredDemo.core.abstracts.LoggerService;
import fifthDayHomeWork.nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String logMessage) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(logMessage);
    }
}
