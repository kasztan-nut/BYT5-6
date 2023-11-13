package ObjectPool;

public class Reusable {
    public String info;

    public Reusable(String info){
        this.info=info;
    }
    public Reusable(){

    }

    public void use(){
        System.out.println("Currently using: " +info);
    }
}
