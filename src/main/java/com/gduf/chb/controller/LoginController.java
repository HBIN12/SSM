package com.gduf.chb.controller;

import com.gduf.chb.bean.Staff;
import com.gduf.chb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String id, String password, Model model) {
        if (loginService.logincheck(id, password)) {
            return "";
        } else {
            model.addAttribute("msg", "账号或密码错误");
            return "login";
        }

    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String tologin() {
        return "login";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(String id, String password, String code, Model model) {
        if (!loginService.checkid(id)) {
            if (code != "") {
                if (loginService.checkcode(code)) {
                    loginService.staffregister(id,password,code);
                    return "login";
                } else {
                    model.addAttribute("msg1", "激活码无效");
                    return "register";
                }
            } else {
                loginService.userregister(id, password);
                model.addAttribute("msg", "注册成功，可直接登录");
                return "login";
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
}
