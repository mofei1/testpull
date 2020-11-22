package test.springsecurity.product.mapper;

import test.springsecurity.model.entity.Product;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ProductMapper extends Mapper<Product> {
}
