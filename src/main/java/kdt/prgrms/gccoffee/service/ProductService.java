package kdt.prgrms.gccoffee.service;

import kdt.prgrms.gccoffee.model.Category;
import kdt.prgrms.gccoffee.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByCategory(Category category);

    List<Product> getAllProducts();

    Product createProduct(String productName, Category category, long price);

    Product createProduct(String productName, Category category, long price, String description);
}
