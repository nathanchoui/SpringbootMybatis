package personal.nathan.model.dataobject;

import lombok.Data;
import lombok.ToString;

/**
 * Created by za-zhangwei002 on 2019/1/30.
 */
@Data
@ToString
public class CountryDO {

    private long id;

    private String countryName;

    private String countryCode;
}
