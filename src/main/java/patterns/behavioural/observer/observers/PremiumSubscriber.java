package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.IndexTrackingWebsite;

import java.util.concurrent.ThreadLocalRandom;

public class PremiumSubscriber extends Subscriber {

    public PremiumSubscriber(IndexTrackingWebsite indexTrackingWebsite) {
        this.indexTrackingWebsite = indexTrackingWebsite;
    }

    private String upOrDown() {
        if (ThreadLocalRandom.current().nextLong() % 2 == 0)
            return "grow";
        else return "not grow";
    }

    @Override
    public void update() {
        System.out.println("Your index is now: " + indexTrackingWebsite.getIndex() + " and it will probably " + upOrDown());
    }
}
