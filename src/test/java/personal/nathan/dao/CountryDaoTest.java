package personal.nathan.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.nathan.MybatisApp;

/**
 * Created by za-zhangwei002 on 2019/1/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisApp.class)
public class CountryDaoTest {

    @Autowired
    private CountryDao countryDao;

    @Test
    public void testFindAll(){
        countryDao.findAll().forEach(System.out::println);
    }
}
