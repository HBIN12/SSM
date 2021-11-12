package com.gduf.chb.service.Impl;

import com.gduf.chb.bean.*;
import com.gduf.chb.mapper.*;
import com.gduf.chb.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    NucleicacidreservationMapper nucleicacidreservationMapper;
    @Autowired
    HospitalMapper hospitalMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    VaccinationreservationMapper vaccinationreservationMapper;
    @Autowired
    NucleicacidresultMapper nucleicacidresultMapper;
    @Autowired
    VaccinationresultMapper vaccinationresultMapper;
    @Autowired
    PatientMapper patientMapper;
    @Override
    public List<Nucleicacidreservation> getnucleicacidreservation(String id) {
        String hospitalname = hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        NucleicacidreservationExample example=new NucleicacidreservationExample();
        NucleicacidreservationExample.Criteria criteria = example.createCriteria();criteria.andHospitalnameEqualTo(hospitalname);
        return nucleicacidreservationMapper.selectByExample(example);
    }

    @Override
    public List<Vaccinationreservation> getvaccinationreservation(String id) {
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        VaccinationreservationExample example=new VaccinationreservationExample();
        VaccinationreservationExample.Criteria criteria = example.createCriteria();
        criteria.andHospitalnameEqualTo(hospitalname);
        return vaccinationreservationMapper.selectByExample(example);
    }

    @Override
    public List<Nucleicacidresult> getnucleicacidresult(String id) {
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        NucleicacidresultExample example=new NucleicacidresultExample();
        NucleicacidresultExample.Criteria criteria = example.createCriteria();
        criteria.andHospitalnameEqualTo(hospitalname);
        return nucleicacidresultMapper.selectByExample(example);

    }

    @Override
    public int updatepass(Nucleicacidreservation nucleicacidreservation) {
        NucleicacidreservationExample example=new NucleicacidreservationExample();
        NucleicacidreservationExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(nucleicacidreservation.getCid());
       return nucleicacidreservationMapper.updateByExampleSelective(nucleicacidreservation,example);
    }

    @Override
    public int updatevpass(Vaccinationreservation vaccinationreservation) {
        VaccinationreservationExample example=new VaccinationreservationExample();
        VaccinationreservationExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(vaccinationreservation.getCid());
        return vaccinationreservationMapper.updateByExampleSelective(vaccinationreservation,example);

    }

    @Override
    public int insertnucleicacidresult(Nucleicacidresult nucleicacidresult,String id) {
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        nucleicacidresult.setHospitalname(hospitalname);
        return nucleicacidresultMapper.insert(nucleicacidresult);
    }

    @Override
    public List<Vaccinationresult> getvaccinationresult(String id) {
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        VaccinationresultExample example=new VaccinationresultExample();
        VaccinationresultExample.Criteria criteria = example.createCriteria();
        criteria.andHospitalnameEqualTo(hospitalname);
        return vaccinationresultMapper.selectByExample(example);

    }

    @Override
    public int isnertvaccinationresult(Vaccinationresult vaccinationresult, String id) {
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        vaccinationresult.setHospitalname(hospitalname);
        return vaccinationresultMapper.insert(vaccinationresult);
    }

    @Override
    public List<Patient> selectpatient() {
        PatientExample example=new PatientExample();
        PatientExample.Criteria criteria = example.createCriteria();
        criteria.andDiagnosisresultsEqualTo("未检测");
        return patientMapper.selectByExample(example);
    }

    @Override
    public int updatepatient(Patient patient, String id) {
        PatientExample example=new PatientExample();
        PatientExample.Criteria criteria = example.createCriteria();
        criteria.andIdcardEqualTo(patient.getIdcard());
        criteria.andPlaceEqualTo(patient.getPlace());
        String hospitalname=hospitalMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(id).getHospitalnumber()).getHospitalname();
        patient.setHospitalname(hospitalname);
        return patientMapper.updateByExampleSelective(patient,example);
    }
}
