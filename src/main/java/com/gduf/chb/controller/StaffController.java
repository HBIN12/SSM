package com.gduf.chb.controller;

import com.gduf.chb.bean.*;
import com.gduf.chb.mapper.VaccinationresultMapper;
import com.gduf.chb.service.StaffService;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;
    @RequestMapping("toa_reserve")
    public String toa_reserve(Model model, HttpSession session){
        List<Nucleicacidreservation> reserves = staffService.getnucleicacidreservation(((Login)session.getAttribute("Login_SESSION2")).getId());
        model.addAttribute("reserves",reserves);
        return "a_reserve";
    }
    @RequestMapping(value = "changepass",method = RequestMethod.GET)
    public String changepass(int cid, String ispass,HttpServletRequest request){
        Nucleicacidreservation nucleicacidreservation=new Nucleicacidreservation();
        nucleicacidreservation.setCid(cid);
        if (ispass.equals("1"))
            nucleicacidreservation.setIspass("通过");
        if(ispass.equals("0"))
            nucleicacidreservation.setIspass("未通过");
        staffService.updatepass(nucleicacidreservation);
        return "redirect:toa_reserve.do";
    }
    @RequestMapping(value = "tov_reserve")
    public String tov_reserve(Model model,HttpSession session){
        List<Vaccinationreservation> vaccs=staffService.getvaccinationreservation(((Login)session.getAttribute("Login_SESSION2")).getId());
        model.addAttribute("vaccs",vaccs);
        return "v_reserve";

    }
    @RequestMapping(value = "changevpass",method = RequestMethod.GET)
    public String changevpass(int cid,String ispass,HttpServletRequest request){

        Vaccinationreservation vaccinationreservation=new Vaccinationreservation();
        vaccinationreservation.setCid(cid);
        if (ispass.equals("1"))
            vaccinationreservation.setIspass("通过");
        if(ispass.equals("0"))
            vaccinationreservation.setIspass("未通过");
        staffService.updatevpass(vaccinationreservation);
        return "redirect:tov_reserve.do";
    }
    @RequestMapping("toa_condition")
    public String toa_condition(Model model,HttpSession session){
        List<Nucleicacidresult> result1 = staffService.getnucleicacidresult(((Login) session.getAttribute("Login_SESSION2")).getId());
        model.addAttribute("result1",result1);
        return "a_condition";
    }
    @RequestMapping(value = "insertnucleicacidresult",method = RequestMethod.POST)
    public String insertnucleicacidresult(String idcard,String result,String time,String name,HttpSession session){
        Nucleicacidresult nucleicacidresult=new Nucleicacidresult();
        nucleicacidresult.setIdcard(idcard);
        nucleicacidresult.setName(name);
        nucleicacidresult.setResult(result);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date retime = null;
        try {
            retime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        nucleicacidresult.setTime(retime);
        staffService.insertnucleicacidresult(nucleicacidresult,((Login)session.getAttribute("Login_SESSION2")).getId());
        return "redirect:toa_condition.do";
    }
    @RequestMapping(value = "tov_condition")
    public String to_condition(Model model,HttpSession session){
        List<Vaccinationresult> vaccr=staffService.getvaccinationresult(((Login) session.getAttribute("Login_SESSION2")).getId());
        model.addAttribute("vaccr",vaccr);
        return "v_condition";
    }
    @RequestMapping(value = "insertvaccinationresult",method = RequestMethod.POST)
    public String insertvaccinationresult(String name,String idcard,String time,String type,HttpSession session){
        Vaccinationresult vaccinationresult=new Vaccinationresult();
        vaccinationresult.setName(name);
        vaccinationresult.setIdcard(idcard);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date retime = null;
        try {
            retime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        vaccinationresult.setTime(retime);
        vaccinationresult.setType(type);
        staffService.isnertvaccinationresult(vaccinationresult,((Login)session.getAttribute("Login_SESSION2")).getId());
        return "redirect:tov_condition.do";
    }
    @RequestMapping(value = "topatient_submit")
    public String topatient_submit(Model model){
        List<Patient> patients = staffService.selectpatient();
        model.addAttribute("patiens",patients);
        return "patient_submit";
    }
    @RequestMapping(value = "changepatient",method = RequestMethod.GET)
    public String changepatient(HttpSession session,String place,String idcard,String diagnosisresults){
        try {
            diagnosisresults=new String(diagnosisresults.getBytes("iso8859-1"),"utf-8");
            place = new String(place.getBytes("iso8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Patient patient=new Patient();
        patient.setIdcard(idcard);
        System.out.println(diagnosisresults);
        patient.setDiagnosisresults(diagnosisresults);
        patient.setPlace(place);
        staffService.updatepatient(patient,((Login)session.getAttribute("Login_SESSION2")).getId());
        return "redirect:topatient_submit.do";
    }
}
