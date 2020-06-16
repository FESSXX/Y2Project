package cn.yhr.book.servlet;

import cn.yhr.book.service.impl.bookServiceimpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/del")
public class delservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        bookServiceimpl bs=new bookServiceimpl();
        PrintWriter pw=resp.getWriter();
        int id=Integer.parseInt(req.getParameter("id"));
        String json= JSON.toJSONString(bs.delbook(id));
        pw.print(json);
        pw.flush();
        pw.close();
    }
}
