package staticproxy.t2.findlove;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:19
 */


public class Father implements Person {

    private Person person;

//    public void findLove() {
//
//        this.person =new Son();
//        before();
//        person.findLove();
//        after();
//    }


    public void findLove() {
        before();
        this.person.findLove();
        after();
    }

    public Father(Person person) {
        this.person = person;
    }

    public void before(){
        System.out.println("爸爸开始帮你找对象");
    }


    public void after(){
        System.out.println("帮你找到了准备结婚吧");
    }
}
