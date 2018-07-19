package Factory;

//工厂方法(Factory Method)大体上和简单工厂差不多,只是工厂方法对每一个实现类都创建了一个工厂类,使得条件判断的逻辑到了客户端,
public class UndergraduateFactory implements IFactory{


    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}

class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
