package template.t2;

import java.sql.ResultSet;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 14:15
 */
public interface RowMapper<T> {

    T mapRow(ResultSet resultSet,int rowNum) throws Exception;
}
