package Mediator;

public class concreteColleague implements colleague{
    public mediator m;

    public void setM(mediator m) {
        this.m = m;
    }

    @Override
    public void send(String mess) {
        m.sendMessage(mess,this);
    }

    @Override
    public void receive(String mess) {
        System.out.println("Message Received");
        System.out.println(mess);
    }
}
