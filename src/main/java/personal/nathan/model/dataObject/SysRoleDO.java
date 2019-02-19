package personal.nathan.model.dataObject;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 *   角色表
 */
@Data
@ToString
public class SysRoleDO extends BaseDO {

    /**
     *   角色名
     */
    private String roleName;

    /**
     *   有效标志
     */
    private Integer enabled;

    /**
     *   创建人
     */
    private Long createBy;

//    /**
//     * 权限列表
//     */
//    private List<SysPrivilegeDO> privilegeList;

}
