package com.gduf.chb.service;

import com.gduf.chb.bean.Hospital;
import com.gduf.chb.bean.Login;
import com.gduf.chb.bean.Staff;
import com.gduf.chb.bean.User;

public interface LoginService {
    String logincheck(String id,String password);
    int userregister(String id,String password);
    int staffregister(String id,String password,String code);
    boolean checkid(String id);
    boolean checkcode(String code);
    int insertstaff(Staff staff);
    Hospital gethospitalbycode(String code);
}
