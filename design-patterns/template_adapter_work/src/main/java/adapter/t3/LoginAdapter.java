package adapter.t3;

import adapter.t2.ResultMsg;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:16
 */


public interface LoginAdapter {

    public boolean support(Object adapter);


    public ResultMsg login(String id,Object adapter);

}
