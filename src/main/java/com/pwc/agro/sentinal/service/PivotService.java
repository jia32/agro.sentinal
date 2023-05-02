package com.pwc.agro.sentinal.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pwc.agro.sentinal.dao.PivotDAO;
import com.pwc.agro.sentinal.dto.Pivot;
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
public class PivotService {
    @Autowired
    private PivotDAO pivotDAO;


    @Value("${spring.datasource.url}")
    private String mysqlurl;

    private static Logger logger = LogManager.getLogger(PivotService.class);

    public JSONObject listFood(){
        List<String> food = pivotDAO.listFoodType(123);
        return RESCODE.SUCCESS.getJSONRES(food);
    }

    public JSONObject findByFood(String food){
        List<Pivot> pivot = pivotDAO.findByFood(food);
        return RESCODE.SUCCESS.getJSONRES(pivot);
    }
}
