package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataObject.SysUserDO;

import java.util.List;

@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserDO record);

    List<SysUserDO> selectAll();

    int updateByPrimaryKey(SysUserDO record);

    SysUserDO findSysUserDOById(Long id);

    SysUserDO findSysUserDOById2(Long id);

    SysUserDO findSysUserDOById3(Long id);

}
