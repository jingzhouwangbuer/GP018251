package adapter.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 14:00
 */


public class PowerAdapterTest
{

    public static void main(String[] args) {

        DC5 dc5 =new PowerAdapter(new AC220());

        dc5.outputDC5V();
    }
}
