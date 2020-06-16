package cn.yhr.crm.entity;

import java.util.List;

public class page {
    private int  count;//总记录数
    private int page;//总页码
    private List<customer> list;//数据集合
    private List<base_dict> blist;//数据字典集合
    private int dqpage;//当前页码
    private int rows;//每页显示的行数糊

    public int getCount() {
        return count;
    }

    public page setCount(int count) {
        this.count = count;
        return this;
    }

    public int getPage() {
        return page;
    }

    public page setPage(int page) {
        this.page = page;
        return this;
    }

    public List<customer> getList() {
        return list;
    }

    public page setList(List<customer> list) {
        this.list = list;
        return this;
    }

    public List<base_dict> getBlist() {
        return blist;
    }

    public page setBlist(List<base_dict> blist) {
        this.blist = blist;
        return this;
    }

    public int getDqpage() {
        return dqpage;
    }

    public page setDqpage(int dqpage) {
        this.dqpage = dqpage;
        return this;
    }

    public int getRows() {
        return rows;
    }

    public page setRows(int rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return "page{" +
                "count=" + count +
                ", page=" + page +
                ", list=" + list +
                ", blist=" + blist +
                ", dqpage=" + dqpage +
                ", rows=" + rows +
                '}';
    }
}
