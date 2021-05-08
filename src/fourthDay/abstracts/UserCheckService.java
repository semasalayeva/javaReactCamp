package fourthDay.abstracts;

import fourthDay.entities.GameUser;

public interface UserCheckService {
    boolean CheckIfRealPerson(GameUser gameUser);
}
