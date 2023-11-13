package Mediator;

public class concreteMediator implements mediator{
    public colleague c1;
    public colleague c2;

    public void setC1(colleague c1) {
        this.c1 = c1;
    }

    public void setC2(colleague c2) {
        this.c2 = c2;
    }

    @Override
    public void sendMessage(String message, colleague sender) {
        if (sender==c1){
            c2.receive("Message from C1: "+ message);
        }
        else if (sender==c2){
            c1.receive("Message from C2: "+ message);
        }
    }
}
