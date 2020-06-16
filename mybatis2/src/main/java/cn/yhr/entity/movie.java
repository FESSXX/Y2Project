package cn.yhr.entity;

public class movie {
    private  int mid;
    private  String mname;
    private  Double price;
    private  String protagonist;
    private  String director;

    public int getMid() {
        return mid;
    }

    public movie setMid(int mid) {
        this.mid = mid;
        return this;
    }

    public String getMname() {
        return mname;
    }

    public movie setMname(String mname) {
        this.mname = mname;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public movie setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public movie setProtagonist(String protagonist) {
        this.protagonist = protagonist;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public movie setDirector(String director) {
        this.director = director;
        return this;
    }
}
