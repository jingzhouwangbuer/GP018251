package adapter.t3;

import adapter.t2.ResultMsg;
import adapter.t2.SignService;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:25
 */


public class PassportForThirdIpml extends SignService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQ.class);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechat.class);
    }

    public ResultMsg loginForSina(String id) {
        return processLogin(id,LoginForSina.class);
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelPhone.class);
    }

    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,passport);
    }


    public ResultMsg processLogin(String key ,Class<? extends LoginAdapter> clazz){

        try{
            LoginAdapter adapter =clazz.newInstance();

            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }else{
                return null;
            }

        }catch (Exception e ){
            e.printStackTrace();
        }
               return null;
    }
}
