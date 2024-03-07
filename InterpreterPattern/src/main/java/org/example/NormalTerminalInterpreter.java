package org.example;

public class NormalTerminalInterpreter implements AbstractExpression{

    String strValue;

    NormalTerminalInterpreter(String strValue){
        this.strValue = strValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(strValue);
    }
}
