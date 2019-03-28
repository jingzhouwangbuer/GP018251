package adapter.t2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 14:31
 */

//老的登陆的方式和注册方式已经不能满足现有的系统
public class SignService {

    public ResultMsg regist(String username,String password){
        ResultMsg resultMsg;
        resultMsg = new ResultMsg(200,"注册成功",new Member());
        System.out.println(resultMsg.toString());
        return resultMsg;
    }
    public ResultMsg login(String username,String password){
        return null;
    }
}
