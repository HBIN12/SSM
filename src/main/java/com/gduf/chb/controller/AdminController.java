package com.gduf.chb.controller;

import com.gduf.chb.bean.Hospital;
import com.gduf.chb.bean.Login;
import com.gduf.chb.mapper.HospitalMapper;
import com.gduf.chb.mapper.LoginMapper;
import com.gduf.chb.service.AdminService;
import com.gduf.chb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "toadminlist",method = RequestMethod.GET)
    public String toadminlist(Model model){
        List<Login> logins = adminService.getalllogin();
        model.addAttribute("logins",logins);
        return "adminlist";
    }


    @RequestMapping(value = "preupdatelogin",method = RequestMethod.GET)
    public String preupdatelogin(Login login,Model model){
        model.addAttribute("login",login);
        return "updatelogin";
    }
    @RequestMapping(value = "updatelogin",method = RequestMethod.POST)
    public String updatelogin(String id,String reid,String password,String role){
        Login login=new Login();
        login.setId(reid);
        login.setPassword(password);
        login.setRole(role);
        adminService.updatelogin(id,login);
        return "redirect:toadminlist.do";
    }
    @RequestMapping(value = "delectlogin",method = RequestMethod.GET)
    public String delectlogin(String id){
        adminService.delectlogin(id);
        return "redirect:toadminlist.do";
    }
    @RequestMapping(value = "insertlogin",method = RequestMethod.POST)
    public String insertlogin(Login login){
        adminService.insertlogin(login);
        return "redirect:toadminlist.do";
    }




    @RequestMapping(value = "tohospitallist",method = RequestMethod.GET)
    public String tohospitallist(Model model){
        List<Hospital> hospitals= adminService.getallhospital();
        model.addAttribute("hospitals",hospitals);
        return "hospitalmanger";
    }
    @RequestMapping(value = "preupdatehospital",method = RequestMethod.GET)
    public String preupdatehospital(String hospitalnumber,Model model){
        Hospital hospital = adminService.selecthospitalbynumber(hospitalnumber);
        model.addAttribute("hospital",hospital);
        return "updatehospital";
    }
    @RequestMapping(value = "updatehospital",method = RequestMethod.POST)
    public String updatehospital(String hospitalname,String hospitalnumber,String code,String rehospitalnumber){
        Hospital hospital=new Hospital();
        hospital.setHospitalnumber(rehospitalnumber);
        hospital.setHospitalname(hospitalname);
        hospital.setCode(code);
        adminService.updatehospital(hospitalnumber,hospital);
        return "redirect:tohospitallist.do";
    }
    @RequestMapping(value = "delecthospital",method = RequestMethod.GET)
    public String delecthospital(String hospitalnumber){
        adminService.deletecthospital(hospitalnumber);
        return "redirect:tohospitallist.do";
    }
    @RequestMapping(value = "inserthospital",method = RequestMethod.POST)
    public String inserthospital(Hospital hospital){
        adminService.inserthosptital(hospital);
        return "redirect:tohospitallist.do";
    }

}
