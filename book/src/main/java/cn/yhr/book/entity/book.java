package cn.yhr.book.entity;

public class book {
    private  int bid;//图书id
    private String bname;//图书名
    private  double price;//图书价格
    private   int tid;//图数类型id


    public int getBid() {
        return bid;
    }

    public book setBid(int bid) {
        this.bid = bid;
        return this;
    }

    public String getBname() {
        return bname;
    }

    public book setBname(String bname) {
        this.bname = bname;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public int getTid() {
        return tid;
    }

    public book setTid(int tid) {
        this.tid = tid;
        return this;
    }
}
