package singleton.enumsingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 15:37
 */


public enum EnumSingleTon {

     ISTANCE;
     private Object data;

     private void EnumSingleTon(){

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static  EnumSingleTon getInstance(){
        return ISTANCE;
    }
}
