package Factory;

public class LeiFeng {
    public void wash(){
        System.out.println("洗衣");
    }
    public void sweep(){
        System.out.println("扫地");
    }
    public void BuyRice(){
        System.out.println("买米");
    }
}

class Undergraduate extends LeiFeng{

}

class Volunteer extends LeiFeng{

}
