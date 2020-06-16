package cn.yhr.crm.servlet;

import cn.yhr.crm.service.impl.customerServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/dels")
public class delsServlet extends HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req,resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            customerServiceimpl cis=new customerServiceimpl();
            String[] id=req.getParameterValues("alldel");
            cis.dels(id);
            HttpSession session=req.getSession();
            session.setAttribute("msg","删除成功");
            session.setMaxInactiveInterval(1);
            resp.sendRedirect("list");
    }
}
