package patterns.behavioural.chainofresponsibility.handlers;

import patterns.behavioural.chainofresponsibility.utility.SupportLevel;

public class DefaultHandler extends TechSupport {

    @Override
    public void handleRequest(String request, SupportLevel severity) {
        System.out.println("We're sorry but we can't handle your request");
    }
}
