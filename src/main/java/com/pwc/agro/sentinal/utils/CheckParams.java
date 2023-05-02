package com.pwc.agro.sentinal.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;

import com.pwc.agro.sentinal.model.RESCODE;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Jasmine
 * @createTime 2021年11月16日上午10:56:34
 */
@Component
public class CheckParams {
    public static JSONObject checkParams(JSONObject params) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<String> param_names = new ArrayList<>();
        Date start = new Date();
        Date end = new Date();
        Boolean flag = false;
        for (Entry<String, Object> entry : params.entrySet()) {
            if (entry.getValue() == null || entry.getValue() == "") {
                param_names.add(entry.getKey());
            }
        }
        return param_names.size() == 0 ? RESCODE.SUCCESS.getJSONRES() :
                RESCODE.PARAM_MISSING.getJSONRES(param_names);
    }
}

