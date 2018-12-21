package service;

import entity.MyStack;

/**
 * Created by chaikai on 2018/12/21.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop=" + myStack.pop());
    }
}
