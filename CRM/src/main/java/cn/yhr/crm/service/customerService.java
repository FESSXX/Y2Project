package cn.yhr.crm.service;

import cn.yhr.crm.entity.customer;
import cn.yhr.crm.entity.page;

import java.util.Map;

public interface customerService {
    public page getallcustomer(Map<String, String[]> map, int page, int rows);
    public page getallcustomer2(Map<String, String[]> map, int page, int rows);
    public  int uddatecustomercount(customer cu); //返回状态码 0失败 1成功
    public int del(int id);//返回状态码 0失败 1成功
    public int dels(String id[]);//返回状态码 0失败 1成功
}
