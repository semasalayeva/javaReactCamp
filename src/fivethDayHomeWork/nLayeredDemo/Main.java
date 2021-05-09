package fivethDayHomeWork.nLayeredDemo;

import fivethDayHomeWork.nLayeredDemo.busniess.abstracts.ProductService;
import fivethDayHomeWork.nLayeredDemo.busniess.concretes.ProductManager;
import fivethDayHomeWork.nLayeredDemo.core.concretes.JLoggerManagerAdapter;
import fivethDayHomeWork.nLayeredDemo.dataAccess.concretes.AbcProdcutDao;
import fivethDayHomeWork.nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProdcutDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);

    }
}
