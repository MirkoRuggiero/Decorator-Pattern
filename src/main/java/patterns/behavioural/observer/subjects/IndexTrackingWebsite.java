package patterns.behavioural.observer.subjects;

import patterns.behavioural.observer.observers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class IndexTrackingWebsite {

    private List<Subscriber> subscribers = new ArrayList<>();
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
        notifyAllObserver();
    }

    public void attach(Subscriber o){
        subscribers.add(o);
    }

    public void notifyAllObserver(){
        subscribers.forEach(Subscriber::update);
    }
}
