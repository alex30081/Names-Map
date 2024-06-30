package app;

public class Main {

    public static void main(String[] args) {
        DataHendler handler = new DataHendler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.getAll());
        uiOperator.getOutput(handler.getById(
                172));
    }
}
