package fivethDayHomeWork.nLayeredDemo.core.concretes;

import fivethDayHomeWork.nLayeredDemo.core.abstracts.LoggerService;
import fivethDayHomeWork.nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String logMessage) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(logMessage);
    }
}
