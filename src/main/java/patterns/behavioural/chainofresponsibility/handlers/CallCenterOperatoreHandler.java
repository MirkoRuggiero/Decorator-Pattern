package patterns.behavioural.chainofresponsibility.handlers;

import patterns.behavioural.chainofresponsibility.utility.SupportLevel;

import java.util.Arrays;
import java.util.List;

public class CallCenterOperatoreHandler extends TechSupport {

    List<SupportLevel> levels = Arrays.asList(SupportLevel.CHATBOT, SupportLevel.CALL_CENTER_AUTOMATICO, SupportLevel.CALL_CENTER_OPERATORE);

    @Override
    public void handleRequest(String request, SupportLevel severity) {
        if (levels.contains(severity))
            System.out.println(request + " is being handled by the call center operator");
        else {
            if (nextTechSupport != null)
                nextTechSupport.handleRequest(request, severity);
        }
    }
}
