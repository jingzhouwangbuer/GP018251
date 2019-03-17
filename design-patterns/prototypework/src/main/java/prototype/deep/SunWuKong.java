package prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 19:24
 */


public class SunWuKong extends Mokey implements Cloneable,Serializable{

   public JinGuBang bang;


   public SunWuKong shallow(SunWuKong sunkong){
       SunWuKong houzi =new SunWuKong();
       houzi.birthDay=new Date();
       houzi.bang=sunkong.bang;
       houzi.id=sunkong.id;
       houzi.name=sunkong.name;
       return  houzi;
   }
  public SunWuKong deep(){
       try{

           ByteArrayOutputStream bos =new ByteArrayOutputStream();

           ObjectOutputStream  os =new ObjectOutputStream(bos);

           os.writeObject(this);


           ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());

           ObjectInputStream is =new ObjectInputStream(bis);

           SunWuKong sunWuKong=   (SunWuKong)is.readObject();

           sunWuKong.birthDay =new Date();
           return sunWuKong;

       }catch (Exception e){
           e.printStackTrace();
           return null;
       }
  }

    public SunWuKong() {
        this.bang = new JinGuBang() ;
        this.birthDay=new Date();
    }


}
