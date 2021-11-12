package com.gduf.chb.utils;

import com.gduf.chb.bean.Login;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if (url.indexOf("/login.do") >= 0 || url.indexOf("/register.do") >= 0) {
            return true;
        }
        HttpSession session = request.getSession();
        Login login = (Login) session.getAttribute("Login_SESSION");
        Login login1=(Login) session.getAttribute("Login_SESSION1");
        Login login2 = (Login) session.getAttribute("Login_SESSION2");
        Login login3 = (Login) session.getAttribute("Login_SESSION3");
        if (login != null ||login2!=null||login1!=null||login3!=null) {
            return true;
        } else {
            request.setAttribute("msg", "您还没有登录，请先登录！");
            request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
