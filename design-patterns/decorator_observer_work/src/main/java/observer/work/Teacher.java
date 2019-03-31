package observer.work;

import com.google.common.eventbus.Subscribe;


/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:14
 */


public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subcribe(GPer per) {

        Question question =per.getQuestion();

        System.out.println("==========================");

        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + per.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +"提问者：" + question.getUserName());

    }
}
