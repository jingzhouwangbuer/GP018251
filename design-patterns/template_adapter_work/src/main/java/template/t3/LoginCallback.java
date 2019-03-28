package template.t3;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 20:08
 */




public interface LoginCallback {

    /**
     * 根据登录编号来查找和获取存储中相应的数据
     *
     * @param loginId 登录编号
     * @return 登录编号在存储中相对应的数据
     */
    UserInfo findLoginUser(String loginId);

    /**
     * 对密码数据进行加密
     *
     * @param pwd      密码数据
     * @param template LoginTemplate对象，通过它来调用在
     *                 LoginTemplate中定义的公共方法或缺省实现
     * @return 加密后的密码数据
     */
    String encryptPwd(String pwd, LoginTemplate template);

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配得上
     *
     * @param lm       用户填写的登录数据
     * @param dbLm     在存储中对应的数据
     * @param template LoginTemplate对象，通过它来调用在
     *                 LoginTemplate中定义的公共方法或缺省实现
     * @return true表示匹配成功，false表示匹配失败
     */
    boolean match(UserInfo lm, UserInfo dbLm, LoginTemplate template);


}



