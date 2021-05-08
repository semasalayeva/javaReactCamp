package fourthDay.concrete;

import fourthDay.abstracts.BaseGameService;
import fourthDay.entities.Game;

public class CampaignManager implements BaseGameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " oyununa kampanya eklendi kampanyadan sonraki fiyat : " + game.getUnitPriceAfterDiscount());
    }

    @Override
    public void update(Game game) {

        System.out.println(game.getName() +" oyununda " + game.getUnitPriceAfterDiscount() + " kampanyasi guncellendi ");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() +" oyunundan " + game.getUnitPriceAfterDiscount() + " kampanyasi silindi ");

    }
}
