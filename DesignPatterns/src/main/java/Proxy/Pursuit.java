package Proxy;

public class Pursuit implements GiveGift{
    SchoolGirl mm ;
    public Pursuit(SchoolGirl mm){
        this.mm = mm ;

    }
    @Override
    public void giveDolls() {
        System.out.println(mm+"送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm+"送你鲜花");
    }

    @Override
    public void giveChololate() {
        System.out.println(mm+"送你巧克力");
    }
}
