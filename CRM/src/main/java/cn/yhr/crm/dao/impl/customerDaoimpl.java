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

    @Override
    public List<customer> getcustomerlist(Map<String, String[]> map, int page, int rows) {
        String sql="SELECT * FROM customer where 1=1";
        StringBuffer b=new StringBuffer(sql);
        Set<String> keys=map.keySet();
        List<Object> vl=new ArrayList<>();
        for (String key:keys){
            if (key.equals("page")||key.equals("rows")){
                continue;
            }else {
                b.append(" and " + key + " like ? ");
                String value = map.get(key)[0];
                vl.add("%" + value + "%");
            }
        }
        int num=(page-1)*rows;
        vl.add(num);
        vl.add(rows);
        b.append(" LIMIT ?,?");
        sql=b.toString();
        return jd.query(sql,vl.toArray(),new BeanPropertyRowMapper<customer>(customer.class));
    }

    @Override
    public int getcustomercount(Map<String, String[]> map) {
        String sql="SELECT COUNT(*) FROM customer  where 1=1";
        StringBuffer b=new StringBuffer(sql);
        Set<String> keys=map.keySet();
        List<Object> vl=new ArrayList<>();
        for (String key:keys){
            if (key.equals("page")||key.equals("rows")){
                continue;
            }else {
                b.append(" and " + key + " like ? ");
                String value = map.get(key)[0];
                vl.add("%" + value + "%");
            }
        }
        sql=b.toString();
        return jd.queryForObject(sql,vl.toArray(),(Integer.class));
    }

    @Override
    public List<base_dict> getbasedictlist() {
        String sql3="SELECT * FROM base_dict" ;
        return jd.query(sql3,new BeanPropertyRowMapper<base_dict>(base_dict.class));
    }

    @Override
    public int uddatecustomercount(customer cu) {
        String sql="UPDATE customer set cust_source=?,cust_industry=?,cust_level=?,cust_linkman=?,cust_phone=?,cust_mobile=?,cust_zipcode=?,cust_address=?  WHERE cust_id=?";
        Object[] prams=new Object[]{cu.getCust_source(),cu.getCust_industry(),cu.getCust_level(),cu.getCust_linkman(),cu.getCust_phone(),cu.getCust_mobile(),cu.getCust_zipcode(),cu.getCust_address(),cu.getCust_id()};
        return jd.update(sql,prams);
    }

    @Override
    public int del(int id) {
        String sql="DELETE FROM customer WHERE cust_id=?";
        return jd.update(sql,id);
    }
}
