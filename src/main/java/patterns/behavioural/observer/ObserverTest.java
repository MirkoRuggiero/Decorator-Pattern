package patterns.behavioural.observer;

import patterns.behavioural.observer.observers.Observer1;
import patterns.behavioural.observer.observers.Observer2;
import patterns.behavioural.observer.subjects.Subject;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.attach(new Observer1(subject));
        subject.attach(new Observer2(subject));

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
