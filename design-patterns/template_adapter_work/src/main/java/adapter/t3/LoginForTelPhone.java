package adapter.t3;

import adapter.t2.ResultMsg;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:24
 */


public class LoginForTelPhone implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelPhone;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
