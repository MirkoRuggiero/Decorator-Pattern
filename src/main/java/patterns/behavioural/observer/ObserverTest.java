package patterns.behavioural.observer;

import patterns.behavioural.observer.observers.NormalSubscriber;
import patterns.behavioural.observer.observers.PremiumSubscriber;
import patterns.behavioural.observer.subjects.IndexTrackingWebsite;

public class ObserverTest {
    public static void main(String[] args) {
        IndexTrackingWebsite indexTrackingWebsite = new IndexTrackingWebsite();

        indexTrackingWebsite.attach(new NormalSubscriber(indexTrackingWebsite));
        indexTrackingWebsite.attach(new PremiumSubscriber(indexTrackingWebsite));

        System.out.println("First index change: 15");
        indexTrackingWebsite.setIndex(15);
        System.out.println("Second index change: 10");
        indexTrackingWebsite.setIndex(10);
    }
}
