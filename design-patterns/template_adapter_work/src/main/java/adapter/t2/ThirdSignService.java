package adapter.t2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 14:36
 */


public class ThirdSignService extends SignService{

    public ResultMsg loginForQQ(String openId){
//1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
//2、密码默认为QQ_EMPTY
//3、注册（在原有系统里面创建一个用户）
//4、调用原来的登录方法
        System.out.println("通过QQ登陆");
        return loginForRegist(openId,null);
    }
    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
//通过token 拿到用户信息，然后再重新登陆了一次
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }
    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }
}
