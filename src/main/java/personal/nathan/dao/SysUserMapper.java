package personal.nathan.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.cache.decorators.FifoCache;
import personal.nathan.model.dataObject.SysUserDO;

import java.util.List;

@Mapper
@CacheNamespace(
        eviction = FifoCache.class,
        flushInterval = 60000,
        size = 1024,
        readWrite = true
)
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserDO record);

    List<SysUserDO> selectAll();

    int updateByPrimaryKey(SysUserDO record);

    SysUserDO findSysUserDOById(Long id);

    SysUserDO findSysUserDOById2(Long id);

    SysUserDO findSysUserDOById3(Long id);

}
