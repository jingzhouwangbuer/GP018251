package observer.t1;

import java.util.Observable;
import java.util.Observer;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:14
 */


public class Teacher implements Observer{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {

        GPer gper= (GPer)o;

        Question question= (Question)arg;

        System.out.println("==========================");

        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +"提问者：" + question.getUserName());

    }
}
