package cn.yhr.book.entity;

public class booktype {
    private  int tid;//类型id
    private String tname;//类型名

    public int getTid() {
        return tid;
    }

    public booktype setTid(int tid) {
        this.tid = tid;
        return this;
    }

    public String getTname() {
        return tname;
    }

    public booktype setTname(String tname) {
        this.tname = tname;
        return this;
    }
}
