package patterns.behavioural.chainofresponsibility;

import patterns.behavioural.chainofresponsibility.handlers.*;
import patterns.behavioural.chainofresponsibility.utility.SupportLevel;
import patterns.behavioural.chainofresponsibility.utility.TechSupportFactory;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {

        TechSupport techSupport = TechSupportFactory.getInstance();

        techSupport.handleRequest("Request for chatbot", SupportLevel.CHATBOT);
        techSupport.handleRequest("Request for call center automatico", SupportLevel.CALL_CENTER_AUTOMATICO);
        techSupport.handleRequest("Request for call center con operatore", SupportLevel.CALL_CENTER_OPERATORE);
        techSupport.handleRequest("Request for help desk", SupportLevel.HELP_DESK);
    }
}
