package cn.yhr.book.servlet;

import cn.yhr.book.entity.book;
import cn.yhr.book.service.impl.bookServiceimpl;
import cn.yhr.book.service.impl.booktypeServiceimpl;
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
import java.util.Set;

@WebServlet("/add")
public class addservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        book b= new book();
        String opr = req.getParameter("opr") == null ? "" : req.getParameter("opr");
        bookServiceimpl bs = new bookServiceimpl();
        booktypeServiceimpl bt = new booktypeServiceimpl();
        HttpSession session = req.getSession();
        if (opr.equals("tlist")) {
            req.setAttribute("tlist", bt.getalltype());
            req.getRequestDispatcher("add.jsp").forward(req, resp);
        } else {
//            b.setBname(req.getParameter("bname"));
//            b.setPrice(Double.parseDouble(req.getParameter("price")));
//            b.setTid(Integer.parseInt(req.getParameter("tid")));
            try {
                BeanUtils.populate(b,req.getParameterMap());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if(bs.addbook(b)!=0) {
                session.setAttribute("err_msg", "新增成功");
            }else {
                session.setAttribute("err_msg", "新增失败");
            }
            session.setMaxInactiveInterval(2);
            resp.sendRedirect("list");
        }
    }
}
