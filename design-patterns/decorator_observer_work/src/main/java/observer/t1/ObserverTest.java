package observer.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:21
 */


public class ObserverTest {

    //GPer 是被观察者  teacher是观察者
    //Gper需要添加观察者对象
     public static void main(String[] args) {
        GPer gper= GPer.getInstance();

        Teacher Tom =new Teacher("Tom");

        Teacher Jack=new Teacher("Jack");

        gper.addObserver(Tom);

        gper.addObserver(Jack);

        Question question =new Question();

        question.setUserName("小明");

        question.setContent("Spring 如何学习");

        gper.publicQuestion(gper,question);

    }
}
