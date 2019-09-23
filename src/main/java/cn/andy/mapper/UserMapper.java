package cn.andy.mapper;

import cn.andy.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByUsername(String username);

    int save(User user);
}
