package personal.nathan.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.nathan.MybatisApp;

/**
 * Created by za-zhangwei002 on 2019/2/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisApp.class)
public class CountryMapperTest {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    public void testSelect() {
        for (int i = 0; i < 3; i ++) {
            countryMapper.selectAll().forEach(System.out::println);
        }
    }
}
