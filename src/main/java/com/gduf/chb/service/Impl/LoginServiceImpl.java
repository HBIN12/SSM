package com.gduf.chb.service.Impl;

import com.gduf.chb.bean.*;
import com.gduf.chb.mapper.HospitalMapper;
import com.gduf.chb.mapper.LoginMapper;
import com.gduf.chb.mapper.StaffMapper;
import com.gduf.chb.mapper.UserMapper;
import com.gduf.chb.service.LoginService;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    HospitalMapper hospitalMapper;
    @Autowired
    StaffMapper staffMapper;
    @Override
    public Login logincheck(String id,String password) {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria = loginExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andPasswordEqualTo(password);
        if (loginMapper.selectByExample(loginExample).isEmpty()){return null;}
        else return loginMapper.selectByExample(loginExample).get(0);
    }

    @Override
    public boolean checkid(String id) {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria = loginExample.createCriteria();
        criteria.andIdEqualTo(id);
        if(loginMapper.selectByExample(loginExample).isEmpty()){return false;}
        else return true;
    }

    @Override
    public int userregister(String id,String password) {
        Login login=new Login();
        login.setId(id);
        login.setPassword(password);
        login.setRole("user");
        return loginMapper.insert(login);
    }

    @Override
    public int staffregister(String id, String password, String code) {
            Login login=new Login();
            login.setId(id);
            login.setPassword(password);
            login.setRole("staff");
            Staff staff=new Staff();
            staff.setId(id);
            staff.setHospitalnumber(gethospitalbycode(code).getHospitalnumber());
            insertstaff(staff);
            return loginMapper.insert(login);
    }




    @Override
    public boolean checkcode(String code) {

        HospitalExample hospitalExample=new HospitalExample();
        HospitalExample.Criteria criteria = hospitalExample.createCriteria();
        criteria.andCodeEqualTo(code);
        if (hospitalMapper.selectByExample(hospitalExample).isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public Hospital gethospitalbycode(String code) {
        HospitalExample hospitalExample=new HospitalExample();
        HospitalExample.Criteria criteria = hospitalExample.createCriteria();
        criteria.andCodeEqualTo(code);
        return hospitalMapper.selectByExample(hospitalExample).get(0);

    }

    @Override
    public int insertstaff(Staff staff) {
      return staffMapper.insert(staff);
    }
}
