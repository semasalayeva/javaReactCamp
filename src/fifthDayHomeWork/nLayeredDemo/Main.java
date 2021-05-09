package fifthDayHomeWork.nLayeredDemo;

import fifthDayHomeWork.nLayeredDemo.busniess.concretes.ProductManager;
import fifthDayHomeWork.nLayeredDemo.busniess.abstracts.ProductService;
import fifthDayHomeWork.nLayeredDemo.core.concretes.JLoggerManagerAdapter;
import fifthDayHomeWork.nLayeredDemo.dataAccess.concretes.AbcProdcutDao;
import fifthDayHomeWork.nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProdcutDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);

    }
}
