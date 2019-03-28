package template.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 13:52
 */


public class TemplateTest {


    public static void main(String[] args) {
        System.out.println("Java课程");
        NetworkCourse javaCourse =new JavaCourse(true);

        javaCourse.createNetWork();

        System.out.println("BigData课程");
        NetworkCourse bigDataCourse =new BigDataCourser();

        bigDataCourse.createNetWork();
    }
}
