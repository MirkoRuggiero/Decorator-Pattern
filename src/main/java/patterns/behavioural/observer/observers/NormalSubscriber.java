package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.IndexTrackingWebsite;

public class NormalSubscriber extends Subscriber {

    public NormalSubscriber(IndexTrackingWebsite indexTrackingWebsite) {
        this.indexTrackingWebsite = indexTrackingWebsite;
    }

    @Override
    public void update() {
        System.out.println("Your index is now: " + indexTrackingWebsite.getIndex());
    }
}
