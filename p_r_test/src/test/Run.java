package test;

import entity.C;
import entity.P;
import extthread.ThreadC;
import extthread.ThreadP;

/**
 * Created by chaikai on 2018/12/21.
 */
public class Run {
    public static void main(String[] args){
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(r);
        pThread.start();
        cThread.start();
    }
}
