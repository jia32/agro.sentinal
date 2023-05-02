package com.pwc.agro.sentinal.controller;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.model.RESCODE;
import com.pwc.agro.sentinal.service.PPITableService;
import com.pwc.agro.sentinal.utils.CheckParams;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Api(tags = "PPI table")
@RestController
@EnableAutoConfiguration
@RequestMapping("/ppi")
public class PPITableController {
    @Autowired
    private PPITableService ppiService;
    @Value("${spring.datasource.url}")
    private String mysqlurl;

    @ApiOperation(value = "展示ppi表中的所有食品类型", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
    })
    @RequestMapping(value="/listFood",method= RequestMethod.GET)
    public JSONObject listFood(){
        return ppiService.listFood();
    }

    @ApiOperation(value = "根据食品类型查询对应的值", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
            @ApiImplicitParam(required = true, name = "food_type", value="食品类型"),
    })
    @RequestMapping(value="/findByFood",method= RequestMethod.GET)
    public JSONObject findByFood(@NotNull(message = "{required}") @RequestParam(name = "food_type", required = true)String food_type){
        return ppiService.findByFood(food_type);
    }
}
