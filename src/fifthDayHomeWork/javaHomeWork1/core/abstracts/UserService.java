package fifthDayHomeWork.javaHomeWork1.core.abstracts;

import fifthDayHomeWork.javaHomeWork1.entities.cocretes.User;

public interface UserService {
    void logIn(String password, String email);
}
