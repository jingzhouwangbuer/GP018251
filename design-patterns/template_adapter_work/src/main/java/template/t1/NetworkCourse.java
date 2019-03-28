package template.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-22 13:21
 */


public abstract class NetworkCourse {


    public final void createNetWork(){
       //1发布预习资料
        this.postPreResource();
//2创建科课程PPT
        this.createPPT();
//3直播视频
        this.liveVideo();
//4.发布笔记
        this.postNote();
//5提交源码
        this.postSource();
//6是否需要检查作业
        if(needHomework()){
            this.checkHomework();
        }

    }

    abstract void checkHomework();
    //钩子方法：实现流程的微调
    protected boolean needHomework(){return false;}

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

    final void createPPT(){
        System.out.println("创建备课PPT");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void postSource(){
        System.out.println("提交源代码");
    }
    final void postNote(){
        System.out.println("提交课件和笔记");
    }



}
