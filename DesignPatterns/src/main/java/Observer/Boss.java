package Observer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {
    private List<Observer> observers = new ArrayList<Observer>() ;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observers);
    }

    @Override
    public void Notify() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

}


class Secretary extends Subject{

    private List<Observer> observers = new ArrayList<Observer>() ;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observers);
    }

    @Override
    public void Notify() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
