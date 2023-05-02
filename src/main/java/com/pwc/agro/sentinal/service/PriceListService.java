package com.pwc.agro.sentinal.service;


import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.dao.PriceDAO;
import com.pwc.agro.sentinal.dao.PriceListDAO;
import com.pwc.agro.sentinal.model.RESCODE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class PriceListService {
    @Autowired
    private PriceListDAO priceListDAO;


    @Value("${spring.datasource.url}")
    private String mysqlurl;

    private static Logger logger = LogManager.getLogger(PriceService.class);

    public JSONObject listFood(){
        return RESCODE.SUCCESS.getJSONRES(priceListDAO.listFoodType(123));
    }

    public JSONObject findByFood(String food){
        return RESCODE.SUCCESS.getJSONRES(priceListDAO.findByFood(food));
    }
}
