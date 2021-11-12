package com.gduf.chb.controller;

import com.gduf.chb.bean.Login;
import com.gduf.chb.bean.Staff;
import com.gduf.chb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String id, String password, Model model, HttpServletRequest request) {
        Login login=loginService.logincheck(id,password);
        if (login!=null) {
            switch (login.getRole()){
                case "user":request.getSession().setAttribute("Login_SESSION",login);return "index";
                case "admin":request.getSession().setAttribute("Login_SESSION1",login);return "redirect:toadminlist.do";
                case "staff":request.getSession().setAttribute("Login_SESSION2",login);return "redirect:toa_reserve.do";
                case "reporter":request.getSession().setAttribute("Login_SESSION3",login);return"redirect:toreporter.do";
                default:return "Login";
            }
        } else {
            model.addAttribute("msg", "账号或密码错误");
            return "Login";
        }

    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String tologin() {
        return "Login";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(String id, String password, String code, Model model) {
        if (!loginService.checkid(id)) {
            if (code != "") {
                if (loginService.checkcode(code)) {
                    loginService.staffregister(id,password,code);
                    model.addAttribute("msg", "医护人员注册成功，可直接登录");
                    return "Login";
                } else {
                    model.addAttribute("msg1", "激活码无效");
                    return "register";
                }
            } else {
                loginService.userregister(id, password);
                model.addAttribute("msg", "注册成功，可直接登录");
                return "Login";
            }
        } else {
            model.addAttribute("msg1", "账号已存在");
            return "register";
        }
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String toregister() {
        return "register";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login.do";
    }
}
