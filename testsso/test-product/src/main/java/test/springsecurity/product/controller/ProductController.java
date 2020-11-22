package test.springsecurity.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.springsecurity.model.entity.Product;
import test.springsecurity.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "product",produces = { "application/json;charset=UTF-8"})
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("list")
    public List<Product> queryAllProduct(){
      return productService.queryAllProduct();
    }
}
