package cn.yhr.crm.service.impl;

import cn.yhr.crm.dao.impl.customerDaoimpl;
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
}
