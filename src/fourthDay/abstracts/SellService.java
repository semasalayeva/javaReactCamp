package fourthDay.abstracts;

import fourthDay.entities.Game;
import fourthDay.entities.GameUser;

public interface SellService {
    void sell(GameUser gameUser, Game game);
}

