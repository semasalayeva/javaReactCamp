package fifthDayHomeWork.nLayeredDemo.dataAccess.concretes;

import fifthDayHomeWork.nLayeredDemo.dataAccess.abstracts.ProductDao;
import fifthDayHomeWork.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class AbcProdcutDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Abc ile eklendi : " + product.getName());

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
