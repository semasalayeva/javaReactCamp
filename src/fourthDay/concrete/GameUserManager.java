package fourthDay.concrete;

import fourthDay.abstracts.GameUserService;
import fourthDay.abstracts.UserCheckService;
import fourthDay.entities.GameUser;

public class GameUserManager implements GameUserService {
    private UserCheckService userCheckService;

    public GameUserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(GameUser gameUser) {
        if(userCheckService.CheckIfRealPerson(gameUser)){
            System.out.println(gameUser.getFirstName() +
                    " " + gameUser.getLastName() + " kayd olma isleminiz tamamlandi");
        }else{
            try {
                throw new Exception("not valid person");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void update(GameUser gameUser) {
        System.out.println(gameUser.getFirstName() +
                " " + gameUser.getLastName() + " Guncelleme isleminiz basariyla tamamlandi");

    }

    @Override
    public void delete(GameUser gameUser) {
        System.out.println( gameUser.getFirstName() +
                " " + gameUser.getLastName() + " Kaydiniz basariyla silindi");
    }
}

