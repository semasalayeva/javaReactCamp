package fivethDayHomeWork.nLayeredDemo.dataAccess.concretes;

import fivethDayHomeWork.nLayeredDemo.dataAccess.abstracts.ProductDao;
import fivethDayHomeWork.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi : " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println();
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
