package template.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 21:18
 */


public class Test {


    public static void main(String[] args) {
        RegisterTemlate temlate =new RegisterTemlate();

        UserInfo user=new UserInfo();

        user.setCode(100000);
        user.setPhone("1334434344");

        UserInfo user2=  temlate.register(user, new RegisterCallback() {
            @Override
            public int sendcode(String phone,RegisterTemlate temlate) {
                int code=temlate.sendcode(phone);
                System.out.println("发送的验证码"+code);
                return code;
            }

            @Override
            public boolean check(int code, int code2, RegisterTemlate temlate) {

                boolean bool=temlate.check(code,code2);
                System.out.println("校验验证码是否成功"+bool);
                return temlate.check(code,code2);
            }

            @Override
            public UserInfo getUserinfo(boolean bool, UserInfo info) {
                if(bool){
                    info.setUserid("111111");
                    info.setPassword("123455");
                    System.out.println("创建新用户成功");
                }
                return info;
            }
        });

        System.out.println(user2.toString());


        ///13554592526的验证码是100000
        //创建新用户成功
       // UserInfo{userid='111111', phone='13554592526', password='123455', code=100000}
    }
}
