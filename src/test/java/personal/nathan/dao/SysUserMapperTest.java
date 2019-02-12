package personal.nathan.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.nathan.MybatisApp;

/**
 * Created by za-zhangwei002 on 2019/2/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisApp.class)
public class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void testFindAll() {
        sysUserMapper.selectAll().forEach(System.out::println);
    }

    /**
     * 一对一关系
     * 用r.role_name "role.roleName" 方式组装SysRoleDO
     */
    @Test
    public void testFindUserById1() {
        System.out.println(sysUserMapper.findSysUserDOById(1001L));
    }

    /**
     * 一对一关系
     * 用resultMap association组装
     */
    @Test
    public void testFindUserById2() {
        System.out.println(sysUserMapper.findSysUserDOById2(1001L));
    }

    /**
     * 一对一关系
     * 用resultMap association 嵌套查询
     */
    @Test
    public void testFindUserById3() {
        System.out.println(sysUserMapper.findSysUserDOById3(1001L));
    }



}
