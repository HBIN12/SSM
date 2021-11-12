package com.gduf.chb.controller;

import com.gduf.chb.bean.Nucleicacidreservation;
import com.gduf.chb.bean.Nucleicacidresult;
import com.gduf.chb.bean.Patient;
import com.gduf.chb.bean.Riskregion;
import com.gduf.chb.service.ReporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ReporterController {
    @Autowired
    ReporterService reporterService;
    @RequestMapping("toreporter")
    public String toreporter(){
        return "risk_area";
    }
    @RequestMapping(value = "insertriskregion",method = RequestMethod.POST)
    public String insertriskregion(Riskregion riskregion,Model model){
        reporterService.insertriskregion(riskregion);
        model.addAttribute("msg","上报成功");
        return "risk_area";
    }
    @RequestMapping(value = "topatient_receive" )
    public String topatient_receive(Model model){
        List<Patient> patients= reporterService.getpatient();
        model.addAttribute("pa",patients);
        return "patient_receive";
    }
}
