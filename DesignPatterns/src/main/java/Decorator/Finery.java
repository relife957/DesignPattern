package Decorator;

public class Finery extends Person{
    private Person component ;

    public void Decorator(Person compnent){
        this.component = compnent ;
    }
    public void show(){
        if (component != null){
            component.show();
        }
    }
}
