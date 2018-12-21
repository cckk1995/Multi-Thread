package extthread;

import service.P;

/**
 * Created by chaikai on 2018/12/21.
 */
public class P_Thread extends Thread{
    private P p;
    public P_Thread(P p){
        super();
        this.p  = p;
    }

    @Override
    public void run() {
        while(true){
            p.pushService();
        }
    }
}
