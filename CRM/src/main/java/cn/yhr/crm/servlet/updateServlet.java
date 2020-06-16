package cn.yhr.crm.servlet;

import cn.yhr.crm.entity.customer;
import cn.yhr.crm.service.impl.customerServiceimpl;
import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/update")
public class updateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw=resp.getWriter();
        customer cu=new customer();
        customerServiceimpl csi=new customerServiceimpl();
        Map<String,String[]> map=req.getParameterMap();
        try {
            BeanUtils.populate(cu,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        String newjson= JSON.toJSONString(csi.uddatecustomercount(cu));
        pw.print(newjson);
        pw.flush();
        pw.close();
    }
}
