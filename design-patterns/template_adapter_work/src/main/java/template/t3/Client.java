package template.t3;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:16
 */


public class Client {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid("admin");
        userInfo.setPassword("workerpwd");

        LoginTemplate lt = new LoginTemplate();
        //如果这是LoginTemplate 对象A
        //假如 LoginCallback 是对象B
        //对象A 调用B的X方法  然后在X方法中再调用B的方法 实现函数回调  从而实现模板方法
        boolean flag = lt.login(userInfo, new LoginCallback() {
            
            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {

                //调用虚拟的加密
                return template.encryptPwd(pwd);
            }

            @Override
            public UserInfo findLoginUser(String loginId) {

                return new UserInfo();
            }

            @Override
            public boolean match(UserInfo userInfo, UserInfo dbuserInfo, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.match(userInfo, dbuserInfo);
            }
        });
        System.out.println("可以进行普通人员登录=" + flag);

        //测试工作人员登录
        boolean flag2 = lt.login(userInfo, new LoginCallback() {
            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                //覆盖父类的方法，提供真正的加密实现
                //这里对密码进行加密，比如使用：MD5、3DES等等，省略了
                System.out.println("使用MD5进行密码加密");
                return pwd;
            }

            @Override
            public UserInfo findLoginUser(String loginId) {
                // 这里省略具体的处理，仅做示意，返回一个有默认数据的对象
                UserInfo userInfo = new UserInfo();
                userInfo.setUserid(loginId);
                userInfo.setPassword("workerpwd");
                return userInfo;
            }

            @Override
            public boolean match(UserInfo userInfo, UserInfo dbuserInfo, LoginTemplate template) {
                //自己不需要覆盖，直接转调模板中的默认实现
                return template.match(userInfo, dbuserInfo);
            }
        });
        System.out.println("可以登录工作平台=" + flag2);
    }
}
