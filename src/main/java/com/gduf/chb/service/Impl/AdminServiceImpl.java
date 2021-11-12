package com.gduf.chb.service.Impl;

import com.gduf.chb.bean.Hospital;
import com.gduf.chb.bean.HospitalExample;
import com.gduf.chb.bean.Login;
import com.gduf.chb.bean.LoginExample;
import com.gduf.chb.mapper.HospitalMapper;
import com.gduf.chb.mapper.LoginMapper;
import com.gduf.chb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    HospitalMapper hospitalMapper;
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    public List<Hospital> getallhospital() {
        HospitalExample hospitalExample=new HospitalExample();
        HospitalExample.Criteria criteria = hospitalExample.createCriteria();
        return hospitalMapper.selectByExample(hospitalExample);
    }

    @Override
    public int deletecthospital(String hosptitalnum) {
        return hospitalMapper.deleteByPrimaryKey(hosptitalnum);
    }

    @Override
    public int inserthosptital(Hospital hospital) {
        return hospitalMapper.insert(hospital);
    }

    @Override
    public int updatehospital(String hospitalnumber,Hospital hospital) {
        HospitalExample example=new HospitalExample();
        HospitalExample.Criteria criteria = example.createCriteria();
        criteria.andHospitalnumberEqualTo(hospitalnumber);
        return hospitalMapper.updateByExample(hospital,example);
    }

    @Override
    public List<Login> getalllogin() {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria = loginExample.createCriteria();

        criteria.andIdIsNotNull();
        return loginMapper.selectByExample(loginExample);
    }

    @Override
    public Login selectlogin(String id) {
        return loginMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delectlogin(String id) {
        return loginMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertlogin(Login login) {
        return loginMapper.insert(login);
    }

    @Override
    public int updatelogin(String id,Login login) {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria = loginExample.createCriteria();
        criteria.andIdEqualTo(id);
        return loginMapper.updateByExample(login,loginExample);
    }

    @Override
    public Hospital selecthospitalbynumber(String hospitalnumber) {
        return hospitalMapper.selectByPrimaryKey(hospitalnumber);
    }
}
