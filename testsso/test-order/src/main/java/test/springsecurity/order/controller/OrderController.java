package test.springsecurity.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.springsecurity.model.entity.Order;
import test.springsecurity.order.service.OrderService;

import java.util.List;

@RestController
@RequestMapping(value = "order",produces = { "application/json;charset=UTF-8"})
public class OrderController {

    private final OrderService orderService;


    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PreAuthorize("hasAuthority('getCurrentUser')")
    @GetMapping("getCurrentUser")
    public Object getCurrentUser(Authentication authentication) {

        return authentication;
    }
    @PreAuthorize("hasAuthority('queryAllOrder')")
    @GetMapping("list")
    public List<Order> queryAllProduct(){
      return orderService.queryAllProduct();
    }
}
