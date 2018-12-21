package extthread;

import service.C;

/**
 * Created by chaikai on 2018/12/21.
 */
public class C_Thread extends Thread{
    private C r;
    public C_Thread(C r){
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while(true){
            r.popService();
        }
    }
}
