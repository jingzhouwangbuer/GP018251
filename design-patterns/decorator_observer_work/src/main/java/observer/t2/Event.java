package observer.t2;

import java.lang.reflect.Method;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 13:35
 */


public class Event {
    //事件源 ，事件是由谁发起的
    private Object source;
//事件触发之后 通知谁
    private Object target;
//事件触发之后需要函数回调
    private Method callback;
//事件名称 触发的是什么事件
    private String trigger;
//事件触发的时间
    private long time;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public Event( ) {
    }

    public Event(Object source, Object target, Method callback, String trigger, long time) {
        this.source = source;
        this.target = target;
        this.callback = callback;
        this.trigger = trigger;
        this.time = time;
    }

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Event{" + "\n" +
                "\tsource=" + source.getClass() + ",\n" +
                "\ttarget=" + target.getClass() + ",\n" +
                "\tcallback=" + callback + ",\n" +
                "\ttrigger='" + trigger + "',\n" +
                "\ttime=" + time + "'\n" +
                '}';
    }
}
