package fifthDayHomeWork.javaHomeWork1.dataAccess.concretes;

import fifthDayHomeWork.javaHomeWork1.dataAccess.abstracts.UserDao;
import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;
import fifthDayHomeWork.javaHomeWork1.entities.cocretes.User;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryCustomerDao implements UserDao {
   public List<Customer> customers = new ArrayList();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
        System.out.println("InMemory ile eklendi : " + customer.getFirstName() + " " + customer.getLastName());

    }

    @Override
    public void update(Customer customer) {
        System.out.println("InMemory ile guncellendi : " + customer.getFirstName() + " " + customer.getLastName());

    }

    @Override
    public void delete(Customer customer) {
        int userId = customer.getUserId();
        customers.remove(userId);
        System.out.println("InMemory ile silindi : " + customer.getFirstName() + " " + customer.getLastName());

    }

    @Override
    public List<Customer> get() {
         return customers;
    }
    public List<String> getMail(){
        List<String> emails =
                customers.stream().
                        map(User::getEmail).
                        collect(Collectors.toList());
        return emails;
    }
    public List<String> getPassword(){
        List<String> password = new ArrayList<>();
        for (Customer customer:customers) {
            password.add(customer.getPassword());
        }
        return password;
    }
}
