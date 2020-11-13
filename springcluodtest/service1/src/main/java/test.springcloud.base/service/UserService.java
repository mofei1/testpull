package test.springcloud.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.freamework.model.entity.User;
import test.springcloud.base.mapper.UserMapper;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.selectAll();
    }

    public User findOneById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
