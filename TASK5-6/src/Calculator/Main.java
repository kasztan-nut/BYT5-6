package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations add=new Addition();
        Operations sub=new Subtraction();
        Operations mul=new Multiplication();
        Operations div=new Division();
        add.nextInChain(sub);
        sub.nextInChain(mul);
        mul.nextInChain(div);

        Operations chain=add;


        System.out.println();
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number:");
        double num1=sc.nextDouble();

        System.out.println("Input operation (+,-,*,/)");
        String op=sc.next();

        System.out.println("Input second number:");
        double num2=sc.nextDouble();

        chain.handleOp(num1,num2,op);
        sc.close();
    }

}
