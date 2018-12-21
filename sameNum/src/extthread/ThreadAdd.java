package extthread;

import entity.Add;

/**
 * Created by chaikai on 2018/12/21.
 */
public class ThreadAdd extends Thread{

    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
