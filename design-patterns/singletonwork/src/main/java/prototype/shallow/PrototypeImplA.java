package prototype.shallow;

import java.util.List;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 18:56
 */


public class PrototypeImplA implements IPrototype {



    private String id ;
    private int age;
    private List<String> hobbies;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public PrototypeImplA clone() {
        PrototypeImplA A= new PrototypeImplA();
        A.age=this.age;
        A.id=this.id;
        A.hobbies=this.hobbies;
        return A;
    }
}
