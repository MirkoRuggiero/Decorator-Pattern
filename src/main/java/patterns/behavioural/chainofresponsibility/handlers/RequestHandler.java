package patterns.behavioural.chainofresponsibility.handlers;

import patterns.behavioural.chainofresponsibility.utility.SupportLevel;

public interface RequestHandler {

    void handleRequest(String request, SupportLevel severity);
}
