package com.gduf.chb.service;

import com.gduf.chb.bean.Nucleicacidreservation;
import com.gduf.chb.bean.Nucleicacidresult;
import com.gduf.chb.bean.Patient;
import com.gduf.chb.bean.Riskregion;

import java.util.List;

public interface ReporterService {
    int insertriskregion(Riskregion riskregion);
    List<Patient> getpatient();
}
