package prototype;

import java.io.*;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 14:55
 */


public class Boy extends Children implements Cloneable,Serializable{

     public Pets pet;


    public Boy() {
        this.pet =new Pets();
    }

    public Boy shalloeclone(Boy xiaoming){
        Boy boy =new Boy();
        boy.age=xiaoming.age;
        boy.name=xiaoming.name;
        boy.pet=xiaoming.pet;
        return boy;
    }

    public Boy deepclone() {
        Boy xiao;
        try{
            ByteArrayOutputStream bos=new ByteArrayOutputStream();

            ObjectOutputStream os =new ObjectOutputStream(bos);

            os.writeObject(this);


            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());

            ObjectInputStream is =new ObjectInputStream(bis);


            xiao=(Boy)is.readObject();


            return xiao;


        }catch (Exception e){
            e.printStackTrace();
        }
           return null;
    }

}
