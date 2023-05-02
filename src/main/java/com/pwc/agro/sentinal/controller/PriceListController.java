package com.pwc.agro.sentinal.controller;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.service.PriceListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Api(tags = "price list table")
@RestController
@EnableAutoConfiguration
@RequestMapping("/pricelist")
public class PriceListController {
    @Autowired
    private PriceListService pricelistService;
    @Value("${spring.datasource.url}")
    private String mysqlurl;

    @ApiOperation(value = "展示pricelist表中的所有食品类型", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
    })
    @RequestMapping(value="/listFood",method= RequestMethod.GET)
    public JSONObject listFood(){
        return pricelistService.listFood();
    }

    @ApiOperation(value = "根据食品或国家类型查询对应的值", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
            @ApiImplicitParam(required = false, name = "food_type", value="食品类型"),
    })
    @RequestMapping(value="/findByFoodAndCountry",method= RequestMethod.GET)
    public JSONObject findByFood(@RequestParam(name = "food_type", required = false)String food_type){
        return pricelistService.findByFood(food_type);
    }
}
