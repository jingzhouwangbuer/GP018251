package observer.work;

import com.google.common.eventbus.EventBus;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:21
 */


public class EventBusTest {

     public static void main(String[] args) {

         GPer ger = GPer.getInstance();
         Question question= new Question();
         question.setUserName("张三");
         question.setContent("设计模式学习方式");
         ger.setQuestion(question);
         EventBus eventBus =new EventBus();
         Teacher teacher =new Teacher("raojituo");
         eventBus.register(teacher);

         eventBus.post(ger);

    }
}
