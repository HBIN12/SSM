package com.gduf.chb.controller;

import com.gduf.chb.bean.*;
import com.gduf.chb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("topersonalstatue")
    public String topersonalstatue(Model model,HttpSession session){
        String id=((Login)session.getAttribute("Login_SESSION")).getId();
        User user=userService.getuserbyid(id);
        String idcard=user.getIdcard();
        String name=user.getName();
        String location=user.getLocation();
        if (user!=null){
            List<Nucleicacidresult> list1=userService.selectNucleicacidresult(idcard);
        model.addAttribute("list1",list1);
        model.addAttribute("list2",userService.selectVaccinationresult(idcard));
        model.addAttribute("list4",userService.selectpatient(idcard));
        model.addAttribute("name",name);
        model.addAttribute("location",location);
        return "personalstatue";}
        else
            return "personalstatue";
    }
    @RequestMapping("toyuyuehesuan")
    public String toyuyuehesuan(Model model){
        model.addAttribute("hospitalnamelist",userService.getallhospitalname());
        return "yuyuehesuan";
    }
    @RequestMapping("toyimiao")
    public String toyimiao(Model model){
        model.addAttribute("hospitalnamelist",userService.getallhospitalname());
        return "yimiao";
}
    @RequestMapping("topayment")
    public String topayment(HttpSession session,Model model){
        String idcard = userService.getuserbyid(((Login) session.getAttribute("Login_SESSION")).getId()).getIdcard();
        List<Nucleicacidreservation> nucleicacidreservations = userService.selectNucleicacidreservation(idcard);
        model.addAttribute("nlist",nucleicacidreservations);
        List<Vaccinationreservation> vaccinationreservations=userService.selectVaccinationreservation(idcard);
        model.addAttribute("vlist",vaccinationreservations);
        return "payment";
    }
    @RequestMapping("tomerngyarea")
    public String tomerngyarea(Model model){
        model.addAttribute("list3",userService.getallriskregion());
        return "merngyarea";
    }
    @RequestMapping("tojinjishangbao")
    public String tojinjishangbao(){
        return "jinjishangbao";
    }
    @RequestMapping("topersonal")
    public String topersonal()
    {
        return "personal";
    }
    @RequestMapping(value = "insertuser",method = RequestMethod.POST)
    public String insertuser(String name, String idcard, String number, String location, HttpSession session,String sex){
        User user=new User();
        user.setName(name);
        user.setId(((Login)session.getAttribute("Login_SESSION")).getId());
        user.setIdcard(idcard);
        user.setLocation(location);
        user.setSex(sex);
        user.setNumber(number);
        userService.insertuser(user);
        session.setAttribute("idcard",idcard);
        return "index";
    }

    @RequestMapping(value = "insertyuyue" ,method = RequestMethod.POST)
    public String insertyuyue(String name, String idcard, String hospitalname, String time,Model model){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date retime = null;
        try {
            retime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Nucleicacidreservation nucleicacidreservation=new Nucleicacidreservation();
        nucleicacidreservation.setName(name);
        nucleicacidreservation.setHospitalname(hospitalname);
        nucleicacidreservation.setIdcard(idcard);
        nucleicacidreservation.setTime(retime);
        nucleicacidreservation.setIspay("是");
        userService.addnucleicacidreservation(nucleicacidreservation);
        model.addAttribute("msg","预约申请成功提交，等待医院审核，可前往预约中心查看审核结果");
        return "yuyuehesuan";
    }
    @RequestMapping(value = "insertpatient",method = RequestMethod.POST)
    public String insertpatient(Model model,String idcard,String name,String time,String place){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date retime = null;
        try {
            retime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Patient patient=new Patient();
        patient.setIdcard(idcard);
        patient.setName(name);
        patient.setPlace(place);
        patient.setTime(retime);
        userService.addpatient(patient);
        model.addAttribute("msg","上报成功");
        return "jinjishangbao";

    }

    @RequestMapping(value = "insertyuyue2" ,method = RequestMethod.POST)
    public String insertyuyue2(String name, String idcard, String hospitalname, String time,Model model,String vaccinetype){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date retime = null;
        try {
            retime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Vaccinationreservation vaccinationreservation=new Vaccinationreservation();
        vaccinationreservation.setName(name);
        vaccinationreservation.setHospitalname(hospitalname);
        vaccinationreservation.setIdcard(idcard);
        vaccinationreservation.setTime(retime);
        vaccinationreservation.setVaccinetype(vaccinetype);
        userService.addvaccinationreservation(vaccinationreservation);
        model.addAttribute("msg","预约申请成功提交，等待医院审核，可前往预约中心查看审核结果");
        return "yimiao";
    }
}
