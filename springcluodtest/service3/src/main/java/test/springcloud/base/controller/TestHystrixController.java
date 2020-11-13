package test.springcloud.base.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.freamework.model.entity.User;

@RestController
@RequestMapping("testhystrix")
//全局降级方法
@DefaultProperties(defaultFallback = "fallBackMethod") // 指定一个类的全局熔断方法
public class TestHystrixController {

    @GetMapping("user")

//    @HystrixCommand(fallbackMethod = "findOneByIdFallBack") 方法降级
    @HystrixCommand
    public String findOneById(@RequestParam("id")Long id) throws InterruptedException {

        Thread.sleep(2000);
        User user = new User();
        user.setId(1l);
        user.setName("张三");
        return user.toString();
    }
    public String fallBackMethod(){
        return  "server busy!";
    }
}
