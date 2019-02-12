package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataObject.SysPrivilegeDO;

import java.util.List;

@Mapper
public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilegeDO record);

    SysPrivilegeDO selectByPrimaryKey(Long id);

    List<SysPrivilegeDO> selectByRoleId();

    List<SysPrivilegeDO> selectAll();

    int updateByPrimaryKey(SysPrivilegeDO record);
}
