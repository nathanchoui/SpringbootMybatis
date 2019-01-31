package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataobject.CountryDO;

import java.util.List;

/**
 * Created by za-zhangwei002 on 2019/1/30.
 */
@Mapper
public interface CountryDao {

    List<CountryDO> findAll();

    List<CountryDO> findCountriesByIds(List<Long> ids);

    void insertCountry(CountryDO countryDO);

    int updateCountry(CountryDO countryDO);

    int deleteCountry(long id);


}
