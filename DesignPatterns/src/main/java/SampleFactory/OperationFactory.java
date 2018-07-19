package SampleFactory;

/**
 *这是一个计算器的后台算法,利用的是简单工厂的设计模式,具体的实现算法并未给出
 */
public class OperationFactory {
    public static Operations createOperate(String operate){
        Operations oper = null ;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break ;
            case "-" :
                oper = new OperationSub();
                break ;
            case "*":
                oper = new OperationMul();
                break;
            case "/" :
                oper = new OperationDiv();
                break ;
         }
         return oper ;
    }
}
