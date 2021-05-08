package fourthDay;

import fourthDay.abstracts.BaseGameService;
import fourthDay.abstracts.GameUserService;
import fourthDay.abstracts.SellService;
import fourthDay.concrete.*;
import fourthDay.entities.Game;
import fourthDay.entities.GameUser;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GameUser gameUser1 = new GameUser(1,"semasalayeva95@gmail.com",
                "123549",1,"Sema","Salayeva",
                "12347987", LocalDate.of(1995,3,18));
        GameUserService gameUserService = new GameUserManager(new UserCheckManager());
        gameUserService.add(gameUser1);
        Game game = new Game(1,"Candy Crush saga",1000,10);
        BaseGameService gameService1 = new CompanyManager();
        gameService1.add(game);
        BaseGameService gameServise = new CampaignManager();
        gameServise.add(game);
        gameServise.update(game);
        SellService sellService = new SellManager();
        sellService.sell(gameUser1, game);

    }
}
