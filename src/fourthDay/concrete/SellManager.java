package fourthDay.concrete;

import fourthDay.abstracts.SellService;
import fourthDay.entities.Game;
import fourthDay.entities.GameUser;

public class SellManager implements SellService {
    @Override
    public void sell(GameUser gameUser, Game game) {
        System.out.println(game.getName() + " " + gameUser.getFirstName() +" "
                + gameUser.getLastName() + " kisisine satildi.");
    }
}
