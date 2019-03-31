package observer.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 10:08
 */


public class Question {

    private String userName;
    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    public Question() {
    }
}
