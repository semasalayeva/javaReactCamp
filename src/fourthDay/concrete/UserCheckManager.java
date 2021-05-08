package fourthDay.concrete;

import fourthDay.abstracts.UserCheckService;
import fourthDay.entities.GameUser;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(GameUser gameUser) {
        return true;
    }
}
