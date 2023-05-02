package com.pwc.agro.sentinal.service;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.dao.PPITableDAO;
import com.pwc.agro.sentinal.dto.PPITable;
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
public class PPITableService {
    @Autowired
    private PPITableDAO PPITableDAO;


    @Value("${spring.datasource.url}")
    private String mysqlurl;

    private static Logger logger = LogManager.getLogger(PPITableService.class);

    public JSONObject listFood(){
        List<String> food = PPITableDAO.listFoodType(123);
        return RESCODE.SUCCESS.getJSONRES(food);
    }

    public JSONObject findByFood(String food){
        List<PPITable> PPITable = PPITableDAO.findByFood(food);
        return RESCODE.SUCCESS.getJSONRES(PPITable);
    }
}
