package patterns.behavioural.observer.observers;

import patterns.behavioural.observer.subjects.IndexTrackingWebsite;

/**
 * Observer abstract class
 */
public abstract class Subscriber {
    protected IndexTrackingWebsite indexTrackingWebsite;
    public abstract void update();
}
