package fifthDayHomeWork.javaHomeWork1.dataAccess.abstracts;

import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;
import fifthDayHomeWork.nLayeredDemo.entities.abstracts.Entity;

import java.util.List;

public interface UserDao {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    List<Customer> get();
    List<String> getMail();
    List<String> getPassword();


}
