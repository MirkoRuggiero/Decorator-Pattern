package patterns.behavioural.chainofresponsibility.handlers;

import patterns.behavioural.chainofresponsibility.utility.SupportLevel;

import java.util.Collections;
import java.util.List;

public class ChatbotSupport extends TechSupport {

    List<SupportLevel> levels = Collections.singletonList(SupportLevel.CHATBOT);

    @Override
    public void handleRequest(String request, SupportLevel severity) {
        if (levels.contains(severity))
            System.out.println(request + " is being handled by the chatbot");
        else {
            if (nextTechSupport != null)
                nextTechSupport.handleRequest(request, severity);
        }
    }
}
