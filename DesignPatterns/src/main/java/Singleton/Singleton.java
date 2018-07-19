package Singleton;

/**
 * 单例模式(Singleton)保证一个类只有一个实例,私有化构造器,使得无法在类外实例化,然后将这个实例作为静态全局变量,保证了该实例只有一个
 * 单例模式严格控制了客户端对实例的操作.
 */
public class Singleton {
    private static Singleton instance ;
    private Singleton(){

    }
    public static Singleton GetInstance(){
        if(instance!=null){
            instance = new Singleton();
        }
        return instance;
    }
}
