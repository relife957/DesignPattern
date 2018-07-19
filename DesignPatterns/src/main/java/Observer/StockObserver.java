package Observer;

public class StockObserver extends Observer {
    public StockObserver(String name,Subject sub) {
        super(name,sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+","+name+"关闭股票,继续工作!");
    }
}

class NBAObserver extends Observer{
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+","+name+"关闭NBA,继续工作");
    }
}
