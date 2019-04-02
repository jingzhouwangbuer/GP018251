package dynamicproxy.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:41
 */


public class DynamicDataSourceEntry {



     public static final String DEFAULT_DATA_SOURCE=null;

     private final static ThreadLocal<String> local = new ThreadLocal<String>();


     public  static  void clear(){
         local.remove();
     }

    public  static  void setDefaultDataSource(String source){
       local.set(source);
    }

    public static String get(){
       return local.get();
    }
    public static void restore() {
        local.set(DEFAULT_DATA_SOURCE);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }
}
