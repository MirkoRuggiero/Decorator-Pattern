package patterns.behavioural.chainofresponsibility.handlers;

import patterns.behavioural.chainofresponsibility.utility.SupportLevel;

import java.util.Arrays;
import java.util.List;

public class HelpDeskHandler extends TechSupport {

    List<SupportLevel> levels = Arrays.asList(SupportLevel.all());

    @Override
    public void handleRequest(String request, SupportLevel severity) {
        if (levels.contains(severity))
            System.out.println(request + " is being handled by our help desk");
        else {
            if (nextTechSupport != null)
                nextTechSupport.handleRequest(request, severity);
        }
    }
}
