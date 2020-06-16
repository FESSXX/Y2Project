package cn.yhr.province.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDao {
    private  static DataSource ds;
    private static JedisPool jedisPool;
    static {
        Properties pro2=new Properties();
        try {
            InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("jedis.properties");
            Properties pro=new Properties();
            pro2.load(is);
            pro.load(BaseDao.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pro2.getProperty("maxTotal")));
        config.setMaxIdle(Integer.parseInt(pro2.getProperty("maxIdle")));
        jedisPool = new JedisPool(config,pro2.getProperty("host"),Integer.parseInt(pro2.getProperty("port")));
    }
    public  static Jedis getJedis(){
    return jedisPool.getResource();
}
    public static DataSource Das(){
        return ds;
    }

    public Connection getconn() throws Exception {
        return ds.getConnection();
    }

    public  void closeAll(Connection conn, PreparedStatement ptst, ResultSet rs){
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ptst!=null){
            try {
                ptst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
