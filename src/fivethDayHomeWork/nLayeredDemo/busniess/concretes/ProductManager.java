package fivethDayHomeWork.nLayeredDemo.busniess.concretes;

import fivethDayHomeWork.nLayeredDemo.busniess.abstracts.ProductService;
import fivethDayHomeWork.nLayeredDemo.core.abstracts.LoggerService;
import fivethDayHomeWork.nLayeredDemo.dataAccess.abstracts.ProductDao;
import fivethDayHomeWork.nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import fivethDayHomeWork.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
      if(product.getCategoryId() == 1){
          System.out.println("bu kategoride urun kabul edilemiyor");
          return;
      }
      productDao.add(product);
      loggerService.logToSystem("urun eklendi : " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
