package fourthDay.concrete;

import fourthDay.abstracts.BaseGameService;
import fourthDay.entities.Game;

public class CompanyManager implements BaseGameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " oyununu eklediniz");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " oyununu guncellediniz");
    }
    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " oyununu sildiniz");

    }
}
