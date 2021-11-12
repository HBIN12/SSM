package com.gduf.chb.service.Impl;

import com.gduf.chb.bean.*;
import com.gduf.chb.mapper.NucleicacidreservationMapper;
import com.gduf.chb.mapper.NucleicacidresultMapper;
import com.gduf.chb.mapper.PatientMapper;
import com.gduf.chb.mapper.RiskregionMapper;
import com.gduf.chb.service.ReporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporterServiceImpl implements ReporterService {
    @Autowired
    RiskregionMapper riskregionMapper;
    @Autowired
    PatientMapper patientMapper;

    @Override
    public int insertriskregion(Riskregion riskregion) {
        return riskregionMapper.insert(riskregion);
    }

    @Override
    public List<Patient> getpatient() {
        PatientExample example=new PatientExample();
        PatientExample.Criteria criteria = example.createCriteria();
        criteria.andDiagnosisresultsEqualTo("阳性");
        return patientMapper.selectByExample(example);
    }
}
