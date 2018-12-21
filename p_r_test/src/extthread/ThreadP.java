package extthread;

import entity.P;

/**
 * Created by chaikai on 2018/12/21.
 */
public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}
