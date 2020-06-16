package cn.yhr.province.servlet;

import cn.yhr.province.entity.province;
import cn.yhr.province.service.impl.provinceServiceimpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/index")
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        ObjectMapper om=new ObjectMapper();
        provinceServiceimpl ps=new provinceServiceimpl();
        PrintWriter pw=resp.getWriter();
        Jedis j=new Jedis();
        if (j.get("pro")==null||j.get("pro")=="") {
            List<province> list = ps.getallprovince();
            j.set("pro", om.writeValueAsString(list));
            System.out.println("To store the cache");//储存缓存
        }else {
            System.out.println("Extract the cache");//提取缓存
        }
        pw.print(j.get("pro"));
        j.close();
        pw.flush();
        pw.close();
    }
}
