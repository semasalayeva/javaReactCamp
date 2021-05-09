package fifthDayHomeWork.nLayeredDemo.busniess.concretes;

import fifthDayHomeWork.nLayeredDemo.busniess.abstracts.ProductService;
import fifthDayHomeWork.nLayeredDemo.core.abstracts.LoggerService;
import fifthDayHomeWork.nLayeredDemo.dataAccess.abstracts.ProductDao;
import fifthDayHomeWork.nLayeredDemo.entities.concretes.Product;

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
