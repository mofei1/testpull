package test.springcloud.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.freamework.model.entity.User;
import test.springcloud.api.User.UserControllerApi;
import test.springcloud.base.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "user",produces = { "application/json;charset=UTF-8"})
public class UserController implements UserControllerApi {

    @Autowired
    private UserService userService;

    @GetMapping(value = "list")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("id/{id}")
    public User findOneById(@PathVariable("id") Long id){
       return this.userService.findOneById(id);
    }

}
