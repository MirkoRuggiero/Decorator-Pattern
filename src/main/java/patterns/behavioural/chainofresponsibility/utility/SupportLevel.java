package patterns.behavioural.chainofresponsibility.utility;

public enum SupportLevel {

    CHATBOT, CALL_CENTER_AUTOMATICO, CALL_CENTER_OPERATORE, HELP_DESK;

    public static SupportLevel[] all() {
        return values();
    }
}

