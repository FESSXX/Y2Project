package cn.yhr.crm.dao;

import cn.yhr.crm.entity.base_dict;
import cn.yhr.crm.entity.customer;
import cn.yhr.crm.entity.page;

import java.util.List;
import java.util.Map;

public interface customerDao {
    public page getallcustomer(Map<String, String[]> map, int page, int rows);
    public List<customer> getcustomerlist(Map<String, String[]> map, int page, int rows);
    public  int getcustomercount(Map<String, String[]> map);
    public  List<base_dict>getbasedictlist();
    public  int uddatecustomercount(customer cu);
    public int del(int id);
}
