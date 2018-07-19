package Strategy;

//这是策略模式的一个实现,并没有实际意义,
//策略模式的意义:我其实是不理解简单工厂和策略模式的区别,但是从书中的例子中勉强可以看出一点端倪,

/**
 * 二者的例子总都有对不同要求的分支判断,而简单工厂将这个分支判断封装到了工厂类,在客户端只需要输入代表要求的字段就可以了,
 * 而策略模式将分支判断交给了客户端,而策略模式的主要内容就是吧
 */
public abstract class Strategy {
    public abstract void AlgorithmInterface() ;
}

class A extends Strategy{

    @Override
    public void AlgorithmInterface() {
        //do something
    }
}

class B extends Strategy{
    @Override
    public void AlgorithmInterface() {
        //do something
    }
}

class C extends Strategy{

    @Override
    public void AlgorithmInterface() {
        //do something
    }
}