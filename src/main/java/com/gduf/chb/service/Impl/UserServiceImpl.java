package com.gduf.chb.service.Impl;

import com.gduf.chb.bean.*;
import com.gduf.chb.mapper.*;
import com.gduf.chb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    NucleicacidresultMapper nucleicacidresultMapper;
    @Autowired
    VaccinationresultMapper vaccinationresultMapper;
    @Autowired
    RiskregionMapper riskregionMapper;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    HospitalMapper hospitalMapper;
    @Autowired
    NucleicacidreservationMapper nucleicacidreservationMapper;
    @Autowired
    VaccinationreservationMapper vaccinationreservationMapper;

    @Override
    public int insertuser(User user) {
       return userMapper.insert(user);
    }

    @Override
    public List<Nucleicacidresult> selectNucleicacidresult(String idcard) {
        NucleicacidresultExample example=new NucleicacidresultExample();
        example.createCriteria().andIdcardEqualTo(idcard);
        return nucleicacidresultMapper.selectByExample(example);
    }

    @Override
    public List<Vaccinationresult> selectVaccinationresult(String idcard) {
        VaccinationresultExample example=new VaccinationresultExample();
        example.createCriteria().andIdcardEqualTo(idcard);
        return vaccinationresultMapper.selectByExample(example);
    }

    @Override
    public User getuserbyid(String id) {
        UserExample example=new UserExample();
        example.createCriteria().andIdEqualTo(id);
        if (!userMapper.selectByExample(example).isEmpty())
        return userMapper.selectByExample(example).get(0);
        else
            return null;

    }

    @Override
    public List<Riskregion> getallriskregion() {
        RiskregionExample example=new RiskregionExample();
        return riskregionMapper.selectByExample(example);
    }

    @Override
    public List<Patient> selectpatient(String idcard) {
        PatientExample example=new PatientExample();
        example.createCriteria().andIdcardEqualTo(idcard);
        if (!patientMapper.selectByExample(example).isEmpty()){
            return patientMapper.selectByExample(example);
        }
        else
            return null;
    }

    @Override
    public List<Hospital> getallhospital() {
        HospitalExample example=new HospitalExample();
        return hospitalMapper.selectByExample(example);
    }

    @Override
    public List<String> getallhospitalname() {
        List<String> list=new ArrayList<String>();
        List<Hospital> hospitals=getallhospital();
        for(int i=0;i<getallhospital().size();i++){
            list.add(hospitals.get(i).getHospitalname());
        }
        return list;
    }

    @Override
    public int addnucleicacidreservation(Nucleicacidreservation nucleicacidreservation) {
        return nucleicacidreservationMapper.insertSelective(nucleicacidreservation);
    }

    @Override
    public List<Nucleicacidreservation> selectNucleicacidreservation(String idcard) {
        NucleicacidreservationExample example= new NucleicacidreservationExample();
        example.createCriteria().andIdcardEqualTo(idcard);
        if (!nucleicacidreservationMapper.selectByExample(example).isEmpty())
            return nucleicacidreservationMapper.selectByExample(example);
        else
            return null;
    }

    @Override
    public List<Vaccinationreservation> selectVaccinationreservation(String idcard) {
        VaccinationreservationExample example=new VaccinationreservationExample();
        example.createCriteria().andIdcardEqualTo(idcard);
        if(!vaccinationreservationMapper.selectByExample(example).isEmpty()){
            return vaccinationreservationMapper.selectByExample(example);
        }
        else return null;
    }

    @Override
    public int addvaccinationreservation(Vaccinationreservation vaccinationreservation) {
        return vaccinationreservationMapper.insertSelective(vaccinationreservation);
    }

    @Override
    public int addpatient(Patient patient) {
        return patientMapper.insertSelective(patient);
    }


}
