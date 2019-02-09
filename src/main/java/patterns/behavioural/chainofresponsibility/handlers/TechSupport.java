package patterns.behavioural.chainofresponsibility.handlers;

public abstract class TechSupport implements RequestHandler {

    protected TechSupport nextTechSupport;

    public TechSupport setNextTechSupport(TechSupport nextTechSupport) {
        this.nextTechSupport = nextTechSupport;
        return this;
    }
}
