package cn.yhr.crm.servlet;

import cn.yhr.crm.service.impl.customerServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
@WebServlet("/list")
public class listServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Map<String,String[]> map=req.getParameterMap();
        customerServiceimpl csi=new customerServiceimpl();
        int page;
        int rows;
        if (req.getParameter("page")==null) {
            page=1;
        }else {
            page = Integer.parseInt(req.getParameter("page"));
        }
        if (req.getParameter("rows")==null) {
            rows=5;
        }else {
            rows = Integer.parseInt(req.getParameter("rows"));
        }
        HttpSession session=req.getSession();
        req.setAttribute("al",session.getAttribute("al"));
        session.removeAttribute("al");
        req.setAttribute("list",csi.getallcustomer(map,page,rows).getList());
        req.setAttribute("list2", csi.getallcustomer(map,page,rows));
        req.setAttribute("list3", csi.getallcustomer(map,page,rows).getBlist());
        req.setAttribute("map",map);
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }
}
