package test.springcloud.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import test.freamework.model.entity.User;
import test.springcloud.api.cateogry.CategoryControllerApi;
import test.springcloud.base.client.UserClient;

import java.util.List;

@RequestMapping(value = "category",produces = { "application/json;charset=UTF-8"})
@RestController
public class CategoryController implements CategoryControllerApi {

    @Autowired
    private UserClient userClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * test Feign调用
     * @return
     */
    @RequestMapping("userList")
    public List<User> findAllUser(){
        List<User> users = userClient.findAll();
        System.out.println(users);
        return users;
    }
    /**
     * test restTemplate 和 ribbon负载均衡
     * 1、ribbon负载均衡是微服务之间的负载均衡
     */

    @GetMapping("user")
    public User queryUserById(@RequestParam("id") Long id){

        String baseUrl = "http://service1/user/id/" + id;
        User user = this.restTemplate.getForObject(baseUrl, User.class);
        return user;
    }



}
