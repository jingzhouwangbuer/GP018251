package template.t2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 14:19
 */


public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> excuteQuery(String sql, RowMapper<?> mapper, Object[] values) throws Exception {

        //1.创建连接对象
        Connection conn=this.getConn();
        //2.创建statement对象或者其子接口 创建语句集
        PreparedStatement statement=this.getStatement(conn,sql);
        //3 得到ResultSet 执行语句集
        ResultSet resultSet=this.excuteQuery(statement,values);
        //4 处理结果集
        List<?> list=this.parsResultset(resultSet,mapper);
        //5 关闭ResultSet 关闭结果集
        this.closeResultSet(resultSet);
        //6 关闭语句集 关闭statement
        this.closeStatement(statement);
        //7 关闭连接对象
        this.closeConn(conn);

       return null;

    }

    public Connection getConn() throws SQLException {
        return this.dataSource.getConnection();
    }

    public PreparedStatement getStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }
    public ResultSet excuteQuery(PreparedStatement statement,Object[] values) throws SQLException {
       for(int i =0;i<values.length;i++){
           statement.setObject(i,values[0]);
       }
       return  statement.executeQuery();
    }
    public List<?> parsResultset(ResultSet set,RowMapper<?> rowMapper) throws Exception {
        List<Object> list =new ArrayList<Object>();
        int num=1;
       while(set.next()){
           list.add(rowMapper.mapRow(set,num++));
       }
       return list;
    }

    public void closeResultSet(ResultSet set) throws SQLException {
        set.close();
    }

    public void closeStatement(PreparedStatement statement) throws SQLException {
        statement.close();
    }

    public void closeConn(Connection conn) throws SQLException {
        conn.close();
    }
}

