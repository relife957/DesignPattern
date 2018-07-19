package Template;

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("学生A抄的试卷");
        TestPaperA A = new TestPaperA();
        A.question1();
        A.question2();
        A.question3();

        System.out.println("学生B抄的试卷");
        TestPaperB B = new TestPaperB();
        B.question1();
        B.question2();
        B.question3();
    }
}
