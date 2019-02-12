package personal.nathan.model.dataObject;

import lombok.Data;
import lombok.ToString;

/**
 *   角色权限关联表
 */
@Data
@ToString
public class SysRolePrivilegeDO extends BaseDO {
    /**
     *   角色ID
     */
    private Long roleId;

    /**
     *   权限ID
     */
    private Long privilegeId;
}
