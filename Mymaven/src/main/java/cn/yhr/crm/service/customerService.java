package cn.yhr.crm.service;

import cn.yhr.crm.entity.page;

import java.util.Map;

public interface customerService {
    public page getallcustomer(Map<String,String[]> map, int page, int rows);
}
