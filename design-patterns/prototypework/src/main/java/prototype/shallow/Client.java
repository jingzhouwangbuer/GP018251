package prototype.shallow;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 19:08
 */


public class Client {


    private IPrototype prototype;

    public IPrototype getPrototype() {
        return prototype;
    }

    public void setPrototype(IPrototype prototype) {
        this.prototype = prototype;
    }

    public Client(IPrototype prototype) {

    }

    public IPrototype starClone(IPrototype prototype){
        return prototype.clone();
    }
}
