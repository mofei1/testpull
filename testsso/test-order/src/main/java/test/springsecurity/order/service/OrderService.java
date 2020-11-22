package test.springsecurity.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springsecurity.model.entity.Order;
import test.springsecurity.model.entity.Product;
import test.springsecurity.order.mapper.OrderMapper;

import java.util.List;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Order> queryAllProduct(){
        return orderMapper.selectAll();
    }
}
