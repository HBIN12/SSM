package com.gduf.chb.service;

import com.gduf.chb.bean.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface UserService {
    int insertuser(User user);
    List<Nucleicacidresult> selectNucleicacidresult(String idcard);
    List<Vaccinationresult> selectVaccinationresult(String idcard);
    User getuserbyid(String id);
    List<Riskregion> getallriskregion();
    List<Patient> selectpatient(String idcard);
    List<Hospital> getallhospital();
    List<String> getallhospitalname();
    int addnucleicacidreservation(Nucleicacidreservation nucleicacidreservation);
    List<Nucleicacidreservation> selectNucleicacidreservation(String idcard);
    List<Vaccinationreservation> selectVaccinationreservation(String idcard);
    int addvaccinationreservation(Vaccinationreservation vaccinationreservation);
    int addpatient(Patient patient);

}
