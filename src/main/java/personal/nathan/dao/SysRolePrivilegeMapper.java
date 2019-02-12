package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataObject.SysRolePrivilegeDO;

import java.util.List;
@Mapper
public interface SysRolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbg.generated
     */
    int insert(SysRolePrivilegeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbg.generated
     */
    List<SysRolePrivilegeDO> selectAll();
}