package service;

import entity.MyStack;

/**
 * Created by chaikai on 2018/12/21.
 */
public class P {
    private MyStack myStack;
    public P(MyStack myStack){
        super();
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
