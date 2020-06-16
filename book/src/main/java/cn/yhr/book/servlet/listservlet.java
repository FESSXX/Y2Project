package cn.yhr.book.servlet;

import cn.yhr.book.service.impl.bookServiceimpl;
import cn.yhr.book.service.impl.booktypeServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
@WebServlet("/list")
public class listservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        bookServiceimpl bs=new bookServiceimpl();
        booktypeServiceimpl bt=new booktypeServiceimpl();
        Map<String,String[]>map=req.getParameterMap();
        req.setAttribute("blist",bs.getallbook(map));
        req.setAttribute("tlist",bt.getalltype());
        req.setAttribute("map",map);
        HttpSession session=req.getSession();
        session.setMaxInactiveInterval(1);
        session.setAttribute("msg","1");
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
