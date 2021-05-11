package fifthDayHomeWork.javaHomeWork1.core.concretes;

import fifthDayHomeWork.javaHomeWork1.core.abstracts.UserService;
import fifthDayHomeWork.javaHomeWork1.dataAccess.abstracts.UserDao;


public class UserManager implements UserService {
   private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void logIn( String password, String email) {
       if(userDao.getMail().contains(email) && userDao.getPassword().contains(password)){
           System.out.println("eposta ve parola gecerlidir giris yapilmisdir");
           return;
       }

        System.out.println("eposta veya parola dogru deyil bilgilerinizi kontrol edin");
    }
}
