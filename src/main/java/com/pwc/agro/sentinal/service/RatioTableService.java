package com.pwc.agro.sentinal.service;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.dao.RatioTableDAO;
import com.pwc.agro.sentinal.dto.RatioTable;
import com.pwc.agro.sentinal.model.RESCODE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class RatioTableService {
    @Autowired
    private RatioTableDAO ratioTableDAO;


    @Value("${spring.datasource.url}")
    private String mysqlurl;

    private static Logger logger = LogManager.getLogger(RatioTableService.class);

    public JSONObject listCountry(){
        List<String> country = ratioTableDAO.listCountry(123);
        return RESCODE.SUCCESS.getJSONRES(country);
    }

    public JSONObject findByCountry(String country){
        List<RatioTable> ratioTables = ratioTableDAO.findByCountry(country);
        return RESCODE.SUCCESS.getJSONRES(ratioTables);
    }
}
