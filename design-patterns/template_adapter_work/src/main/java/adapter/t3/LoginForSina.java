package adapter.t3;

import adapter.t2.ResultMsg;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:21
 */


public class LoginForSina implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSina;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
