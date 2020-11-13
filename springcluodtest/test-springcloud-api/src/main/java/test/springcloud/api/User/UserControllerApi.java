package test.springcloud.api.User;

import test.freamework.model.entity.User;

import java.util.List;

public interface UserControllerApi {
    List<User> findAll();
}
