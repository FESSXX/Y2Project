package cn.yhr.entity;

public class product {
    private  int pid;
    private  String pname;
    private  Double price;
    private  int tid;

    public int getPid() {
        return pid;
    }

    public product setPid(int pid) {
        this.pid = pid;
        return this;
    }

    public String getPname() {
        return pname;
    }

    public product setPname(String pname) {
        this.pname = pname;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public product setPrice(Double price) {
        this.price = price;
        return this;
    }

    public int getTid() {
        return tid;
    }

    public product setTid(int tid) {
        this.tid = tid;
        return this;
    }
}
