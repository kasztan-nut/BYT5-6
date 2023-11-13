package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ReusablePool {

    public int maxSize;
    private List<Reusable> pool = new ArrayList<>();

    public ReusablePool(int maxSize){
        this.maxSize=maxSize;
    }
    public void setMaxPoolSize(int i){
        maxSize=i;
    }
    public Reusable acquire(){
        Reusable r=new Reusable("null");
        if (pool.isEmpty()){
            System.out.println("The pool is currently empty!");
        }
        else{
            r=getInstance();
            pool.remove(pool.get(pool.size()-1));
            System.out.println("Reusable acquired from the pool");
        }
        return r;
    }
    public void release(Reusable r){
        if (pool.size()<=maxSize-1){
            pool.add(r);
            System.out.println("Reusable released to pool");
        }
        else System.out.println("Pool is full! Cannot release Reusable to pool");
    }
    public Reusable getInstance(){
        return pool.get(pool.size()-1);
    }

}
