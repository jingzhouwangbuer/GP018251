package observer.T3;

import com.google.common.eventbus.Subscribe;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-31 16:21
 */


public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
//业务逻辑
        System.out.println("执行subscribe 方法,传入的参数是:" + str);
    }
}
