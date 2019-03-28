package template.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:59
 */


public class UserInfo {


    private String userid;
    private String phone;
    private String password;
    private int code;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "userid='" + userid + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                '}';
    }
}
