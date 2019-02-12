package personal.nathan.model.dataObject;

import lombok.Data;
import lombok.ToString;

import java.util.List;


/**
 *   用户表
 *
 */
@Data
@ToString
public class SysUserDO extends BaseDO {

    /**
     *   用户名
     */
    private String userName;

    /**
     *   密码
     */
    private String userPassword;

    /**
     *   邮箱
     */
    private String userEmail;

    /**
     *   简介
     */
    private String userInfo;

    /**
     *   头像
     */
    private byte[] headImg;

    /**
     * 角色
     */
    private SysRoleDO role;

    /**
     * 角色列表
     */
    private List<SysRoleDO> roleList;

}
