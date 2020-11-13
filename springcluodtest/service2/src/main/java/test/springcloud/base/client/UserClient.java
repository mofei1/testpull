package test.springcloud.base.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import test.freamework.model.entity.User;

import java.util.List;

@FeignClient(value = "service1")
public interface UserClient {
    @GetMapping("user/list")
    List<User> findAll();

}
