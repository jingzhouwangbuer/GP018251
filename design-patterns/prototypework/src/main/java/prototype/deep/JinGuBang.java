package prototype.deep;

import java.io.Serializable;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 19:26
 */


public class JinGuBang implements Serializable{



    private int length=1000;

    private int width=50;

    public void big(){
        this.length=length*10;
        this.width=width*10;
    }

    public void small(){
        this.length=length/10;
        this.width=width/10;
    }
}
