package org.example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",3);
        context.put("b",8);
        context.put("c",9);
        context.put("d",5);
        AbstractExpression exp1 = new MultiplyNonterminalIntepreter(new NormalTerminalInterpreter("a"),new NormalTerminalInterpreter("b"));
        int interpret = exp1.interpret(context);
        System.out.println(interpret);

        AbstractExpression exp2 = new BinaryNonterminalInterpreter(
                new BinaryNonterminalInterpreter(
                        new NormalTerminalInterpreter("a"),
                        new NormalTerminalInterpreter("c"),'+'),
                new BinaryNonterminalInterpreter(new NormalTerminalInterpreter("d"),
                        new NormalTerminalInterpreter("b"),'*'),'+');
        int ans2 = exp2.interpret(context);
        System.out.println(ans2);
    }
}