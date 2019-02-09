package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
