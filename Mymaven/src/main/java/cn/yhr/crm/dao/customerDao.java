package cn.yhr.crm.dao;

import cn.yhr.crm.entity.customer;
import cn.yhr.crm.entity.page;

import java.util.List;
import java.util.Map;

public interface customerDao {
    public page getallcustomer(Map<String,String[]> map, int page, int rows);
}
