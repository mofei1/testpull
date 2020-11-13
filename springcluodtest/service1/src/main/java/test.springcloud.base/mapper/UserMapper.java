package test.springcloud.base.mapper;

import test.freamework.model.entity.User;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
