package com.gduf.chb.service;

import com.gduf.chb.bean.*;

import java.util.List;

public interface StaffService {
    List<Nucleicacidreservation> getnucleicacidreservation(String id);
    List<Vaccinationreservation> getvaccinationreservation(String id);
    int updatepass(Nucleicacidreservation nucleicacidreservation);
    int updatevpass(Vaccinationreservation vaccinationreservation);
    List<Nucleicacidresult> getnucleicacidresult(String id);
    int insertnucleicacidresult(Nucleicacidresult nucleicacidresult,String id);
    List<Vaccinationresult> getvaccinationresult(String id);
    int isnertvaccinationresult(Vaccinationresult vaccinationresult,String id);
    List<Patient> selectpatient();
    int updatepatient(Patient patient,String id);
}
