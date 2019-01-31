package personal.nathan.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.nathan.MybatisApp;
import personal.nathan.model.dataobject.CountryDO;

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

    @Test
    public void testInsert() {
        CountryDO countryDO = new CountryDO();
        countryDO.setCountryCode("JP");
        countryDO.setCountryName("日本");
        countryDao.insertCountry(countryDO);
        System.out.println(countryDO.getId());
    }

    @Test
    public void testUpdate() {
        CountryDO countryDO = new CountryDO();
        countryDO.setCountryCode("JP");
        countryDO.setCountryName("日本-日本");
        countryDO.setId(11);
        countryDao.updateCountry(countryDO);
    }

    @Test
    public void testDelete() {
        int delCnt = countryDao.deleteCountry(9);
        Assert.assertEquals(1, delCnt);
    }

}
