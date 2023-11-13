package Calculator;

public interface Operations {
    void handleOp(double num1,double num2, String operator);
    boolean correctOp(String s);
    void nextInChain(Operations nextOp);
}
