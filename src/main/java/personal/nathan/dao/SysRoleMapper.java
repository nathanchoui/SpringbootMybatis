package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataObject.SysRoleDO;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDO record);

    SysRoleDO selectByRoleId(Long id);

    List<SysRoleDO> selectAll();

    int updateByPrimaryKey(SysRoleDO record);
}
