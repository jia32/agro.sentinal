package com.pwc.agro.sentinal.controller;


import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.service.RatioTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Api(tags = "ratioTable table")
@RestController
@EnableAutoConfiguration
@RequestMapping("/ratioTable")

public class RatioTableController {
    @Autowired
    private RatioTableService ratioTableService;
    @Value("${spring.datasource.url}")
    private String mysqlurl;

    @ApiOperation(value = "展示ratioTable表中的所有国家类型", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
    })
    @RequestMapping(value="/listCountry",method= RequestMethod.GET)
    public JSONObject listCountry(){
        return ratioTableService.listCountry();
    }

    @ApiOperation(value = "根据国家类型查询对应的值", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
            @ApiImplicitParam(required = true, name = "country", value="国家"),
    })
    @RequestMapping(value="/findByCountry",method= RequestMethod.GET)
    public JSONObject findByCountry(@NotNull(message = "{required}") @RequestParam(name = "country", required = true)String country){
        return ratioTableService.findByCountry(country);
    }
}
