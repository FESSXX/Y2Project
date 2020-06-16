package cn.yhr.book.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//@WebFilter("/*")
public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
        if (uri.contains("list") || uri.contains("/js")||uri.contains("add")||uri.contains("add.jsp")||uri.contains("update")||uri.contains("update.jsp")||uri.contains("del")) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = req.getSession();
            if (session.getAttribute("msg") == null) {
                req.getRequestDispatcher("list").forward(request, response);
            } else {
                chain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
