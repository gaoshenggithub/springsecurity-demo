package cn.andy.mapper;

import cn.andy.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRolesMapper {

    List<Role> selectRoles(Long userId);
}
