package kdt.prgrms.gccoffee.controller;

import kdt.prgrms.gccoffee.model.Product;
import kdt.prgrms.gccoffee.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productsPage(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product-list";
    }
}