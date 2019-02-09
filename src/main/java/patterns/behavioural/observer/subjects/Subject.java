package patterns.behavioural.observer.subjects;

import patterns.behavioural.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer o){
        observers.add(o);
    }

    public void notifyAllObserver(){
        observers.forEach(Observer::update);
    }
}
