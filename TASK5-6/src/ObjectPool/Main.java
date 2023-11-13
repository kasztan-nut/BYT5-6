package ObjectPool;

public class Main {
    public static void main(String[] args) {
        ReusablePool carPark=new ReusablePool(3);
        Car c1=new Car("Bentley",2);
        Car c2=new Car("Volvo",5);
        Car c3=new Car("Volkswagen",4);
        Car c4=new Car("Audi",7);

        carPark.release(c1);
        carPark.release(c2);
        carPark.release(c3);
        carPark.release(c4);


        Reusable rental = carPark.acquire();
        rental.use();
        carPark.release(rental);
        Reusable r1 = carPark.acquire();
        Reusable r2 = carPark.acquire();
        Reusable r3 = carPark.acquire();
        Reusable r4 = carPark.acquire();

    }
}
