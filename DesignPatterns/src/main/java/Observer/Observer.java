package Observer;

/**
 * 观察者模式(Observser)定义了一种一对多的依赖关系,其实就是一种监听模式,对某个对象的状态进行监听,当该对象发生变化时,就通知所有观察者对象
 * 使得他们能够自动更新自己.
 * 当一个对象的改变需要同时改变其他很多对象的时候,既可以使用观察者模式,
 */
abstract class Observer {
    String name ;
    Subject sub ;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }
    public abstract void update() ;

}

