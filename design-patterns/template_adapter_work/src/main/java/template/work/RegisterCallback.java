package template.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:58
 */


public interface RegisterCallback {

    public int sendcode(String phone,RegisterTemlate temlate);

    public boolean check(int code,int code2,RegisterTemlate temlate);

    public UserInfo getUserinfo(boolean bool,UserInfo info);
}
