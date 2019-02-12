package personal.nathan.model.dataObject;

import lombok.Data;
import lombok.ToString;

/**
 *   权限表
 */
@Data
@ToString
public class SysPrivilegeDO extends BaseDO {

    /**
     *   权限名称
     */
    private String privilegeName;

    /**
     *   权限URL
     */
    private String privilegeUrl;

}
