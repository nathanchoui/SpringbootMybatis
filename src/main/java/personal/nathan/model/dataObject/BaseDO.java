package personal.nathan.model.dataObject;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by za-zhangwei002 on 2019/2/11.
 */
@Data
@ToString
public class BaseDO {

    /**
     *   主键ID
     */
    protected Long id;

    /**
     *   创建时间
     */
    protected Date createTime;
}
