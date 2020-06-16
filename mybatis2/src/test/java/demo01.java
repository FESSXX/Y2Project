import cn.yhr.entity.movie;
import cn.yhr.entity.product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class demo01 {
    SqlSession sql=null;
    @Before
    public  void session() throws IOException {
        String rs = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(rs);
        SqlSessionFactory session = new SqlSessionFactoryBuilder().build(is);
        sql = session.openSession();
    }
    @Test
    public  void demo1() {
            movie m=sql.selectOne("cn.yhr.mdao.getmoivebyid",1);
            sql.close();
            System.out.println(m.getMname());
    }
    @Test
    public  void demo2(){
        movie m=new movie();
        m.setMname("神雕侠侣");
        m.setPrice(20.00);
        m.setProtagonist("不知道");
        m.setDirector("不晓得");
        int num=sql.insert("cn.yhr.mdao.addmovie",m);
        sql.commit();
        sql.close();
        if (num==1){
            System.out.println("新增成功");
        }
    }
    @Test
    public  void demo3(){
        movie m=sql.selectOne("cn.yhr.mdao.getmoviebymname","刀剑神域");
        sql.close();
        System.out.println(m.getPrice());
    }
    @Test
    public  void demo4(){
        movie m=new movie();
        m.setPrice(34.00);
        m.setMname("神雕侠侣");
        int num=sql.update("cn.yhr.mdao.updatemovie",m);
        sql.commit();
        sql.close();
        if (num==1){
            System.out.println("修改成功");
        }
    }
    @Test
    public  void demo5(){
        movie m=new movie();
        m.setMid(7);
        int num=sql.delete("cn.yhr.mdao.delmovie",m);
        sql.commit();
        sql.close();
        if (num==1){
            System.out.println("删除成功");
        }
    }
}
