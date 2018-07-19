package Template;

/**
 * 模板模式(Template Method),这个是模式是定义一个框架,然后将框架中的一些步骤延迟到子类中实现,以此实现不改变算法结构就修改了某些步骤
 */
public class TestPaper {
    public void question1(){
        System.out.println("问题一:");
        System.out.println("答案:"+answer1());
    }

    public String answer1() {
        return "" ;
    }

    public void question2(){
        System.out.println("问题二:");
        System.out.println("答案:"+answer2());
    }

    public  String answer2() {
        return "" ;
    }

    public void question3(){
        System.out.println("问题三:");
        System.out.println("答案:"+answer3());
    }

    public String answer3() {
        return "" ;
    }
}
