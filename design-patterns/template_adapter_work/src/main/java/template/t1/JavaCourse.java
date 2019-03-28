package template.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 13:43
 */


public class JavaCourse extends NetworkCourse {

      private boolean flage;

    public JavaCourse(boolean flage) {
        this.flage = flage;
    }

    void checkHomework() {
        System.out.println("检查了作业");
    }

    protected boolean needHomework(){
      return this.flage;
    }
}
