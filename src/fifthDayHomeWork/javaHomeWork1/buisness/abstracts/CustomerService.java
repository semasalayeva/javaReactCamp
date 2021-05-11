package fifthDayHomeWork.javaHomeWork1.buisness.abstracts;

import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;
import fifthDayHomeWork.javaHomeWork1.entities.cocretes.User;

import java.util.List;

public interface CustomerService {
    void singIn(Customer customer);
    void add(Customer customer);
    void emailConfirm(Customer customer);
    List<Customer> getAll();
}
