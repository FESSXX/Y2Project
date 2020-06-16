package cn.yhr.province.dao.impl;

import cn.yhr.province.dao.BaseDao;
import cn.yhr.province.dao.provinceDao;
import cn.yhr.province.entity.province;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

public class provinceDaoimpl extends BaseDao implements provinceDao {
    @Override
    public List<province> getallprovince() {
        JdbcTemplate jd=new JdbcTemplate(BaseDao.Das());
        String sql="select * from province";
        List<province>  plist =jd.query(sql,new BeanPropertyRowMapper<province>(province.class));
        return plist;
    }
}
