package observer.T3;

import com.google.common.eventbus.EventBus;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-31 16:32
 */


public class GuavaEventTest
{

    public static void main(String[] args) {
        EventBus eventBus =new EventBus();

        GuavaEvent event =new GuavaEvent();
        eventBus.register(event);
        eventBus.post("raojituo");
    }
}
