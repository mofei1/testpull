package test.springsecurity.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springsecurity.model.entity.Product;
import test.springsecurity.product.mapper.ProductMapper;

import java.util.List;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> queryAllProduct(){
        return productMapper.selectAll();
    }
}
