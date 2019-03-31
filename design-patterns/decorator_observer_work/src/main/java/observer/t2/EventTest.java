package observer.t2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 14:09
 */


public class EventTest {

    public static void main(String[] args) {
        MouseEventCallback callback =new MouseEventCallback();

        Mouse mouse =new Mouse();

        mouse.addLisenter(MouseEventType.ON_BLUR,callback);
        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_MOVE, callback);
        mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
        mouse.addLisenter(MouseEventType.ON_OVER, callback);

        mouse.click();


    }
}
