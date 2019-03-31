package com.cn.delegate.t1;

import java.util.HashMap;
import java.util.Map;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-19 21:50
 */


public class Leader implements IEmployee{


    private Map<String,Object> map =new HashMap<String,Object>();

    public Leader() {
        map.put("搭建服务器",new EmployeeA());
        map.put("搭建系统",new EmployeeB());
    }

    public void doing(String command) {
        if(map.containsKey(command)){
            System.out.println("领导开始指挥员工做事");
            ((IEmployee)map.get(command)).doing(command);
        }
        else{
            System.out.println("找不到会该技术的员工");
        }

    }
}
