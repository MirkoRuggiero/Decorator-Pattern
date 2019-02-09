package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.Subject;

public class Observer1 extends Observer {

    public Observer1(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("New state by obs1: " + subject.getState());
    }
}
