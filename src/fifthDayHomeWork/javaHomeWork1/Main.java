package fifthDayHomeWork.javaHomeWork1;

import fifthDayHomeWork.javaHomeWork1.buisness.concretes.CustomerManager;
import fifthDayHomeWork.javaHomeWork1.core.concretes.GoogleLoggerAdapter;
import fifthDayHomeWork.javaHomeWork1.core.concretes.UserManager;
import fifthDayHomeWork.javaHomeWork1.dataAccess.concretes.InMemoryCustomerDao;
import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "semasalayeva95@gmail.com", "123456",
                1, "Sema", "Salayeva");
        Customer customer1 = new Customer(2, "gdhgh@gmail.com", "56876d", 2, "Muhammed",
                "Mustafa");
        Customer customer2 = new Customer(3, "sfhglfugdi", "56465", 3, "Hdsjadh", "jdjsjdhjd");


        InMemoryCustomerDao dao = new InMemoryCustomerDao();
        CustomerManager customerManager = new CustomerManager(dao, new GoogleLoggerAdapter());
        UserManager userManager = new UserManager(dao);

        customerManager.singIn(customer);
        customerManager.emailConfirm(customer);
        System.out.println("---------------------------------------------------------------------");

        customerManager.singIn(customer1);
        customerManager.emailConfirm(customer1);
        System.out.println("---------------------------------------------------------------------");

        customerManager.singIn(customer2);
        customerManager.emailConfirm(customer2);
        System.out.println("---------------------------------------------------------------------");

        userManager.logIn("123456", "semasalayeva95@gmail.com");
        System.out.println("---------------------------------------------------------------------");

        userManager.logIn("56876d", "gdhgh@gmail.com");
        System.out.println("---------------------------------------------------------------------");

        userManager.logIn("56876", "gdhgh@gmail.com");
        System.out.println("---------------------------------------------------------------------");

        System.out.println(customerManager.getAll());


    }

}
