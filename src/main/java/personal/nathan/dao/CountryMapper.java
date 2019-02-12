package personal.nathan.dao;

import org.apache.ibatis.annotations.Mapper;
import personal.nathan.model.dataObject.CountryDO;

import java.util.List;

@Mapper
public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CountryDO record);

    CountryDO selectByPrimaryKey(Integer id);

    List<CountryDO> selectAll();

    int updateByPrimaryKey(CountryDO record);
}
