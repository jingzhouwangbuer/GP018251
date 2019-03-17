package prototype;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 15:06
 */


public class Test {


    public static void main(String[] args) {
        Boy xiaoming =new Boy();

        Boy xiaohong=xiaoming.shalloeclone(xiaoming);

        Boy xiaohua=xiaoming.deepclone();


        System.out.println(xiaoming.pet==xiaohong.pet);

        System.out.println(xiaoming.pet==xiaohua.pet);

    }
}
