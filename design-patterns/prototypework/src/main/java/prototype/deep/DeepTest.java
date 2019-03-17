package prototype.deep;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 19:43
 */


public class DeepTest {


    public static void main(String[] args) {
        SunWuKong sunWuKong =new SunWuKong();

        SunWuKong houzi1 =sunWuKong.shallow(sunWuKong);

        SunWuKong houzi2 =sunWuKong.deep();

        System.out.println("浅克隆"+(houzi1.bang==sunWuKong.bang));

        System.out.println("深克隆"+(houzi2.bang==sunWuKong.bang));


    }
}
