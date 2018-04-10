package cn.safetys.vo;

import java.io.Serializable;

/**
 * Created by linux on 2018-4-10.
 */
public class Emp implements Serializable{

    private String ename="zhangsan";

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
