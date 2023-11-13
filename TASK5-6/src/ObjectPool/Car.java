package ObjectPool;

public class Car extends Reusable{
    public String brand;
    public int num_seats;

    public Car(String brand, int num_seats) {
        this.info="Brand: "+brand+" Num Seats: "+num_seats;
    }
}
