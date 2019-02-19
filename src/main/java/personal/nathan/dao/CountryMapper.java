
package personal.nathan.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.cache.decorators.FifoCache;
import personal.nathan.model.dataObject.CountryDO;

import java.util.List;

@Mapper
@CacheNamespace(
        eviction = FifoCache.class,
        flushInterval = 60000,
        size = 1024,
        readWrite = true
)
public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CountryDO record);

    CountryDO selectByPrimaryKey(Integer id);

    List<CountryDO> selectAll();

    int updateByPrimaryKey(CountryDO record);

}
