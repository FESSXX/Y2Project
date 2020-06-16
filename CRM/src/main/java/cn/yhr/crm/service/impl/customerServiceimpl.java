package cn.yhr.crm.service.impl;

import cn.yhr.crm.dao.impl.customerDaoimpl;
import cn.yhr.crm.entity.customer;
import cn.yhr.crm.entity.page;
import cn.yhr.crm.service.customerService;

import java.util.Map;

public class customerServiceimpl implements customerService {
    customerDaoimpl cs=new customerDaoimpl();
    @Override
    public page getallcustomer(Map<String, String[]> map, int page, int rows) {
        page p=cs.getallcustomer(map,page,rows);
        return p;
    }

    @Override
    public page getallcustomer2(Map<String, String[]> map, int page, int rows) {
        page p=new page();
        p.setRows(rows);
        p.setBlist(cs.getbasedictlist());
        p.setList(cs.getcustomerlist(map,page,rows));
        p.setCount(cs.getcustomercount(map));
        p.setDqpage(page);
        p.setPage(p.getCount()%p.getRows()==0?p.getCount()/p.getRows():p.getCount()/p.getRows()+1);
        return p;
    }

    @Override
    public int uddatecustomercount(customer cu) {
        System.out.println(cu.getCust_linkman());
        if (cs.uddatecustomercount(cu)!=0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int del(int id) {
        if (cs.del(id)!=0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int dels(String[] id) {
        int i = 0;
        for (String val : id) {
            if (cs.del(Integer.parseInt(val)) == 1) {
                i++;
            }
        }
        int num = 0;//默认为失败
        if (i == id.length) {
            num = 1;
        }
        return num;
    }
}
