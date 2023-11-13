package Mediator;

public class Main {
    public static void main(String[] args) {
        concreteMediator med=new concreteMediator();
        concreteColleague c1=new concreteColleague();
        concreteColleague c2=new concreteColleague();

        med.setC1(c1);
        med.setC2(c2);
        c1.setM(med);
        c2.setM(med);

        c1.send("Hello. How are you?");
        c2.send("I'm fine. Thanks for asking!");

    }
}
