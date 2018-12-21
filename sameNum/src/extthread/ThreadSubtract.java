package extthread;

import entity.Subtract;

/**
 * Created by chaikai on 2018/12/21.
 */
public class ThreadSubtract extends Thread{
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
