package Adapter;

abstract class Player {
    String name ;

    public Player(String name) {
        this.name = name;
    }
    abstract void attack();
    abstract void defense();
}

class Forward extends Player{

    public Forward(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("前锋"+name+"进攻");
    }

    @Override
    void defense() {
        System.out.println("前锋"+name+"防守");
    }
}

class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("中锋"+name+"进攻");
    }

    @Override
    void defense() {
        System.out.println("中锋"+name+"防守");
    }
}

class Guard extends Player{
    public Guard(String name) {
        super(name);
    }


    @Override
    void attack() {
        System.out.println("后卫"+name+"进攻");
    }

    @Override
    void defense() {
        System.out.println("后卫"+name+"防守");
    }
}