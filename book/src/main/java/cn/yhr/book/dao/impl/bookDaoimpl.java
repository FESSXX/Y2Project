package cn.yhr.book.dao.impl;

import cn.yhr.book.dao.BaseDao;
import cn.yhr.book.dao.bookDao;
import cn.yhr.book.entity.book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bookDaoimpl extends BaseDao implements bookDao {
    JdbcTemplate jd=new JdbcTemplate(BaseDao.Das());
    @Override
    public List<book> getallbook(Map<String, String[]> map) {
        String sql="Select * from book where 1=1";
        List<book>blist=null;
        try {
            StringBuffer b=new StringBuffer(sql);
            Set<String>keys=map.keySet();
            List<Object>value=new ArrayList<>();
            for (String key:keys) {
                if (map.get(key)[0]!=null&&map.get(key)[0]!="") {
                    b.append(" AND " + key + " Like ? ");
                    String val = map.get(key)[0];
                    value.add("%" + val + "%");
                }
            }
            sql=b.toString();
            blist= jd.query(sql,value.toArray(),new BeanPropertyRowMapper<book>(book.class));
        }catch (Exception e){
            e.getStackTrace();
        }
        return blist;
    }

    @Override
    public int updatebook(book b) {
        String sql="UPDATE book SET bname=?,price=?,tid=? WHERE bid=?";
        int num=0;
        Object[] parms=new Object[]{b.getBname(),b.getPrice(),b.getTid(),b.getBid()};
        try {
                num= jd.update(sql,parms);
        }catch (Exception e){
            e.getStackTrace();
        }
        return  num;
    }

    @Override
    public int addbook(book b) {
        String sql="INSERT  INTO  book(bname,price,tid) values (?,?,?)";
        int num=0;
        Object[] parms=new Object[]{b.getBname(),b.getPrice(),b.getTid()};
        try {
            num= jd.update(sql,parms);
        }catch (Exception e){
            e.getStackTrace();
        }
        return num;
    }

    @Override
    public int delbook(int id) {
        String sql="DELETE  from book where bid=?";
        int num=0;
        try {
            num= jd.update(sql,id);
        }catch (Exception e){
            e.getStackTrace();
        }
        return num;
    }

    @Override
    public book getbook(int id) {
        book b=jd.queryForObject("select * from book where bid=?",new BeanPropertyRowMapper<book>(book.class),id);
        return b;
    }
}
