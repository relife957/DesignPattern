package Decorator;

/**
 * 装饰着模式(Decorator),装饰着模式的意义是为已有的功能形态动态的添加更多功能,重要的是动态二字,也可以说是严格遵守了开闭原则
 * 其中的新功能的添加完全没有修改原来的类,只是添加新的装饰类,然后在客户端的调用中进行修改,就可以了完成添加新功能
 */
public class ConcreteDecorator {

}
class Tshit extends Finery{
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}

class BigTrouser extends Finery{
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

class Suit extends Finery{
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}

class Tie extends Finery{
    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}

class Shoes extends Finery{
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}