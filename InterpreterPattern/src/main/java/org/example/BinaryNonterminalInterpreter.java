package org.example;

public class BinaryNonterminalInterpreter implements AbstractExpression{

    AbstractExpression leftExpression;

    AbstractExpression rightExpression;

    char operation;

    BinaryNonterminalInterpreter(AbstractExpression leftExpression,AbstractExpression rightExpression,char operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int interpret(Context context) {
        switch (operation){
            case '*' :
                return leftExpression.interpret(context) * rightExpression.interpret(context);

            case '+' :
                return leftExpression.interpret(context) + rightExpression.interpret(context);

            default:
                return 0;
        }
    }
}
