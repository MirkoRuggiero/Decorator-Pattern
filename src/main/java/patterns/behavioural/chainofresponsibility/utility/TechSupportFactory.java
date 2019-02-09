package patterns.behavioural.chainofresponsibility.utility;

import patterns.behavioural.chainofresponsibility.handlers.*;

public class TechSupportFactory {

    public static TechSupport getInstance() {

        TechSupport techSupport = new ChatbotSupport();
        return techSupport.setNextTechSupport(new CallCenterAutomaticoHandler().setNextTechSupport(new CallCenterOperatoreHandler().setNextTechSupport(new HelpDeskHandler().setNextTechSupport(new DefaultHandler()))));
    }
}
