package com.kkotto;

public enum Action {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");
    private final String textAction;

    Action(String textAction) {
        this.textAction = textAction;
    }

    public String getTextAction() {
        return textAction;
    }

    public static Action determineAction(String action) {
        for (Action textAction : Action.values()) {
            if (textAction.getTextAction().equals(action)) {
                return textAction;
            }
        }
        return DIVISION;
    }
}
