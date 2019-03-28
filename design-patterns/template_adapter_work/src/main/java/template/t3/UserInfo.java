package template.t3;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:09
 */


public class UserInfo {


    /**用户编号
     */
    private String userid;

    /**
     * 登录密码
     */
    private String password;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public UserInfo(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public UserInfo() {
    }
}
