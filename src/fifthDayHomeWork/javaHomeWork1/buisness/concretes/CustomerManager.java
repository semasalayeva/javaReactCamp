package fifthDayHomeWork.javaHomeWork1.buisness.concretes;

import fifthDayHomeWork.javaHomeWork1.buisness.abstracts.CustomerService;
import fifthDayHomeWork.javaHomeWork1.core.abstracts.LoggerService;
import fifthDayHomeWork.javaHomeWork1.dataAccess.abstracts.UserDao;
import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;


import java.util.List;

public class CustomerManager implements CustomerService {
    private UserDao dao;
    private LoggerService loggerService;

    public CustomerManager(UserDao dao, LoggerService loggerService) {
        this.dao = dao;
        this.loggerService = loggerService;
    }

    @Override
    public void singIn(Customer customer) {
        if(ValidationManager.customerValidate(customer)
                && ValidationManager.eMailIsVerified(customer)
                && ValidationManager.isEmail(customer,dao.getMail())
                && ValidationManager.firstNameIsVerified(customer)
                && ValidationManager.lastNameISVerified(customer)
                && ValidationManager.passwordIsVerified(customer)){
            System.out.println(customer.getFullName() +
                            " epostaniza dorulama mesaji gonderilmisdir lutfen epostanizi dogrulayin");

        }else{
            System.out.println("Kayd olma isleminiz tamamlanamdi bilgileriniz lutfen dogru giriniz "
                    + customer.getFullName());
        }

    }
    public  void emailConfirm(Customer customer){
            if(ValidationManager.customerValidate(customer)
                    && ValidationManager.eMailIsVerified(customer)
                    && ValidationManager.isEmail(customer,dao.getMail())
                    && ValidationManager.firstNameIsVerified(customer)
                    && ValidationManager.lastNameISVerified(customer)
                    && ValidationManager.passwordIsVerified(customer)){
        System.out.println(customer.getEmail() +
                " eposta dogrulandi giris isleminiz basariyla tamamlandi ");
        customer.setFlag(true);
        add(customer);
            }
    }

    @Override
    public void add(Customer customer){
        if(customer.isFlag()){
            dao.add(customer);
            loggerService.send("kisi eklendi : " + customer.getFullName());
        }else{
            System.out.println(customer.getEmail() + " epostaniz dogrulanmamisdir lutfen epostanizi dogrulayin ");
        }
    }

    @Override
    public List<Customer> getAll() {
        return dao.get();
    }
}
