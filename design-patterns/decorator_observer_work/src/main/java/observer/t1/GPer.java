package observer.t1;

import java.util.Observable;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:05
 */


public class GPer extends Observable {

    private String name ="GPer学院";
    private static GPer gper;

    private GPer(){

    }
    public static GPer getInstance(){
        if(gper==null){
            gper =new GPer();
        }
        return gper;
    }

    public String getName(){
        return  name;
    }

    public void publicQuestion (GPer gper, Question question){

        System.out.println(question.getUserName()+ "在" + this.name + "上提交了一个问题。");

        setChanged();

        notifyObservers(question);

    }
}