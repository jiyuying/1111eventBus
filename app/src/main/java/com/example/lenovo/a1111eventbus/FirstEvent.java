package com.example.lenovo.a1111eventbus;

/**
 * Created by lenovo on 2016/11/11.
 */
public class FirstEvent {
    private String msg;

    public FirstEvent(String msg) {
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }
}
