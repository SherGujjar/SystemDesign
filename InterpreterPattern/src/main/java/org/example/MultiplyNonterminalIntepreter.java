package org.example;

public class MultiplyNonterminalIntepreter implements AbstractExpression {

    AbstractExpression leftExpression;

    AbstractExpression rightExpression;

    MultiplyNonterminalIntepreter(AbstractExpression leftExpression,AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
