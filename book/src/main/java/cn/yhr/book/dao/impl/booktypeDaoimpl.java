package cn.yhr.book.dao.impl;

import cn.yhr.book.dao.BaseDao;
import cn.yhr.book.dao.booktypeDao;
import cn.yhr.book.entity.booktype;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class booktypeDaoimpl extends BaseDao implements booktypeDao {
    JdbcTemplate jd=new JdbcTemplate(BaseDao.Das());
    @Override
    public List<booktype> getalltype() {
        List<booktype>tlist=null;
        String sql="SELECT * FROM  booktype";
        try {
            tlist=jd.query(sql,new BeanPropertyRowMapper<booktype>(booktype.class));
        }catch (Exception e){
            e.getStackTrace();
        }
        return  tlist;
    }
}
