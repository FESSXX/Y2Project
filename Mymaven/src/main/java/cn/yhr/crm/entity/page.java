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

    public void setCount(int count) {
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<customer> getList() {
        return list;
    }

    public void setList(List<customer> list) {
        this.list = list;
    }

    public int getDqpage() {
        return dqpage;
    }

    public void setDqpage(int dqpage) {
        this.dqpage = dqpage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<base_dict> getBlist() {
        return blist;
    }

    public void setBlist(List<base_dict> blist) {
        this.blist = blist;
    }
}
