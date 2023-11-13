package Calculator;

public class Subtraction implements Operations{
    public Operations nextOp;

    @Override
    public void handleOp(double num1, double num2, String operator) {
        if (correctOp(operator)){
            double result=num1-num2;
            System.out.println(num1 +" - "+num2+" = "+result);
        }
        else{
            if (this.nextOp!=null){
                nextOp.handleOp(num1,num2,operator);
            }
        }
    }

    @Override
    public boolean correctOp(String c) {
        return c.equals("-");
    }
    @Override
    public void nextInChain(Operations nextOp) {
        this.nextOp=nextOp;
    }
}
