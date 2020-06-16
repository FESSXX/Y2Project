package cn.yhr.crm.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDao {
    private  static DataSource ds;
    static {
        try {
            Properties pro=new Properties();
            pro.load(BaseDao.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
