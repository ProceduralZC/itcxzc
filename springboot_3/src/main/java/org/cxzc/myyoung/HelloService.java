package org.cxzc.myyoung;

public class HelloService {
    private String msg;
    public String autoInfo(){
        return "你好 " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

