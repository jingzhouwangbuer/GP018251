package adapter.t3;

import adapter.t2.ResultMsg;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:20
 */


public class LoginForQQ implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQ;
    }

    public ResultMsg login(String id, Object adapter) {
        ResultMsg resultMsg =new ResultMsg(1,"QQ登陆",null);
        System.out.println(resultMsg.toString());
        return resultMsg;
    }
}
