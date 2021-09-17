package kdt.prgrms.gccoffee.controller.api;

import kdt.prgrms.gccoffee.model.Category;
import kdt.prgrms.gccoffee.model.Product;
import kdt.prgrms.gccoffee.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductApiController {

    private final ProductService productService;

    public ProductApiController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products")
    public List<Product> productList(@RequestParam Optional<Category> category){
        return category
                .map(productService::getProductByCategory)
                .orElse(productService.getAllProducts());
    }
}
