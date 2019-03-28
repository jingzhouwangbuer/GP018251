package template.t2;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 16:14
 */


public class MemberDao extends JdbcTemplate {


    public MemberDao(DataSource dataSource){
        super(dataSource);
    }

    @Override
    public List<?> excuteQuery(String sql, RowMapper<?> mapper, Object[] values) throws Exception {
        return super.excuteQuery(sql, mapper, values);
    }


    public List<?> getAll() throws Exception {
        List<?> list =new ArrayList();
        String sql="select * from Member";
        list=super.excuteQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet resultSet, int rowNum) throws Exception {
                Member member = new Member();
                member.setUid(resultSet.getString("uid"));
                member.setUname("uname");
                return member;
            }
        },null);
        return list;
    }


}
