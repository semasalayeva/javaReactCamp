package fifthDayHomeWork.nLayeredDemo.busniess.abstracts;

import fifthDayHomeWork.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
