package com.jr.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登入功能过滤器，实现没有登录跳到登录页面
 */
@WebServlet("/*")
public class LoginFilter implements Filter {

    String []urls={"/filterweb/login.jsp"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        boolean boo=false;
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        for(String s:urls){
            if(s.equals(request.getRequestURI())){
                boo=true;
                break;
            }
        }
        if(boo){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            //判断其他访问路径中，是否已经做过登录功能了【一个用户只会产生一个session对象】
            HttpSession session=request.getSession();
            Object obj=session.getAttribute("user");
            if(obj!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                response.sendRedirect("login.jsp");
            }
        }
    }

    @Override
    public void destroy() {
        System.out.println("------TestFilter---destroy----");
    }
}
