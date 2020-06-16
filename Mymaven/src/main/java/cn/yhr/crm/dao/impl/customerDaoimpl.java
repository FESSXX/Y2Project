package cn.yhr.crm.dao.impl;

import cn.yhr.crm.dao.BaseDao;
import cn.yhr.crm.dao.customerDao;
import cn.yhr.crm.entity.base_dict;
import cn.yhr.crm.entity.customer;
import cn.yhr.crm.entity.page;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class customerDaoimpl extends BaseDao implements customerDao {
    JdbcTemplate jd=new JdbcTemplate(super.Das());
    @Override
    public page getallcustomer(Map<String, String[]> map, int page, int rows) {
        page p=new page();
        String sql1="SELECT COUNT(*) FROM customer  where 1=1";
        String sql="SELECT * FROM customer where 1=1";
        String sql3="SELECT * FROM base_dict" ;
        p.setBlist(jd.query(sql3,new BeanPropertyRowMapper<base_dict>(base_dict.class)));
        StringBuffer b=new StringBuffer(sql);
        StringBuffer b2=new StringBuffer(sql1);;
        Set<String> keys=map.keySet();
        List<Object> vl=new ArrayList<>();
        for (String key:keys){
            if (key.equals("page")||key.equals("rows")){
                continue;
            }else {
                b.append(" and " + key + " like ? ");
                b2.append(" and " + key + " like ? ");
                String value = map.get(key)[0];
                vl.add("%" + value + "%");
            }
        }
        p.setDqpage(page);
        p.setRows(rows);
        int num=(page-1)*rows;
        sql1=b2.toString();
        int cou=jd.queryForObject(sql1,vl.toArray(),(Integer.class));
        p.setCount(cou);
        int num2=p.getCount()%p.getRows()==0?p.getCount()/p.getRows():p.getCount()/p.getRows()+1;
        p.setPage(num2);
        vl.add(num);
        vl.add(p.getRows());
        b.append(" LIMIT ?,?");
        sql=b.toString();
        List<customer> list=jd.query(sql,vl.toArray(),new BeanPropertyRowMapper<customer>(customer.class));
        p.setList(list);
        return p;
    }
}
