package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.Subject;

public class Observer2 extends Observer {

    public Observer2(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void update() {
        System.out.println("New state by obs2: " + subject.getState());
    }
}
