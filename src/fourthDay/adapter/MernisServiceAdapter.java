package fourthDay.adapter;

import fourthDay.abstracts.UserCheckService;
import fourthDay.entities.GameUser;
import fourthDay.mernisService.WCKKPSPublicSoap;

public class MernisServiceAdapter implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(GameUser gameUser) {
        WCKKPSPublicSoap client = new WCKKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.valueOf(gameUser.getNationalId()),gameUser.getFirstName(),gameUser.getLastName(),
                    gameUser.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
