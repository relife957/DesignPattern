package Adapter;

/**
 * 适配器模式(Adapter)最重要的就是这个翻译类,它联系了外籍中锋和其他本土球员之间的沟通,放在编程中就是两个功能相近的类,但是需要它的接口却无法使用它
 * ,这个时候,我么不能去修改原来的接口,而是添加一个适配器,把这个类和接口连接起来,是的他们能够工作
 */
public class Translator extends Player {
    ForeignCenter fc = new ForeignCenter();

    public Translator(String name) {
        super(name);
        fc.setName(name);
    }

    @Override
    void attack() {
        fc.进攻();
    }

    @Override
    void defense() {
        fc.防守();
    }
}
