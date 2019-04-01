package adapter.t3;

import adapter.t2.ResultMsg;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 15:22
 */


public interface IPassportForThird {



    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForSina(String id);

    ResultMsg loginForTelphone(String telphone, String code);

    ResultMsg loginForRegist(String username, String passport);

}
