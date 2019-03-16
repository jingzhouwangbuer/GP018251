package singleton.containersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 16:28
 */


public class ContainerSingleton {

    private static Map<String,Object> ioc =new ConcurrentHashMap<String,Object>();


    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }

    }

}
