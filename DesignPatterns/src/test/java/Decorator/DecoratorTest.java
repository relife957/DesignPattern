package Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Person xs = new Person("小草");
        System.out.println("第一种装扮如下:");
        BigTrouser bigTrouser = new BigTrouser();
        Tshit tshit = new Tshit();
        Tie tie = new Tie();

        bigTrouser.Decorator(xs);
        tshit.Decorator(bigTrouser);
        tie.Decorator(tshit);
        tie.show();
    }
}
