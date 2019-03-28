package template.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:57
 */


public class RegisterTemlate {


    public UserInfo register(UserInfo userInfo,RegisterCallback callback){


        //1  根据手机发送验证码
     int code= sendcode(userInfo.getPhone());
        //2  校验验证码
     boolean bool =check(code,userInfo.getCode());
        //
        //3  返回用户信息boolean
      UserInfo info =  callback.getUserinfo(bool,userInfo);
      return info;
    }

    public int sendcode(String phone){
        System.out.println(phone+"的验证码是"+100000);
        return 100000;
    }

    public boolean check(int code,int code2){
        if(code==code2){
            return  true;
        }
        return false;
    };

}
