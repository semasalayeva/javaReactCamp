package fifthDayHomeWork.javaHomeWork1.core.concretes;

import fifthDayHomeWork.javaHomeWork1.core.abstracts.LoggerService;

public class EmailLoggerManager implements LoggerService {
    @Override
    public void send(String message) {
        System.out.println("Email'a mesaj gonderildi");
    }
}
