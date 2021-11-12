package com.gduf.chb.service;

import com.gduf.chb.bean.Hospital;
import com.gduf.chb.bean.Login;

import java.util.List;

public interface AdminService {
    //医院信息管理
    List<Hospital> getallhospital();
    int deletecthospital(String hospitalnum);
    int inserthosptital(Hospital hospital);
    int updatehospital(String hospitalnumber,Hospital hospital);
    //修改登录信息
    List<Login> getalllogin();
    Login selectlogin(String id);
    int delectlogin(String id);
    int  insertlogin(Login login);
    int updatelogin(String id,Login login);
    Hospital selecthospitalbynumber(String hospitalnumber);

}
