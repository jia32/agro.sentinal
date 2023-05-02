package com.pwc.agro.sentinal.service;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.dao.ProductionDAO;
import com.pwc.agro.sentinal.model.RESCODE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class ProductionService {
    @Autowired
    private ProductionDAO productionDAO;


    @Value("${spring.datasource.url}")
    private String mysqlurl;

    private static Logger logger = LogManager.getLogger(PriceService.class);

    public JSONObject listFood(){
        return RESCODE.SUCCESS.getJSONRES(productionDAO.listFoodType(123));
    }

    public JSONObject listCountry(){
        return RESCODE.SUCCESS.getJSONRES(productionDAO.listCountry(123));
    }

    public JSONObject findByCountryAndFood(String food, String country){
        return RESCODE.SUCCESS.getJSONRES(productionDAO.findByCountryAndFood(food, country));
    }
}
