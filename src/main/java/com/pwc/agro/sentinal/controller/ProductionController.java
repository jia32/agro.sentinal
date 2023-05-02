package com.pwc.agro.sentinal.controller;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.service.ProductionService;
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

@Api(tags = "production table")
@RestController
@EnableAutoConfiguration
@RequestMapping("/production")
public class ProductionController {
    @Autowired
    private ProductionService productionService;
    @Value("${spring.datasource.url}")
    private String mysqlurl;

    @ApiOperation(value = "展示production表中的所有食品类型", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
    })
    @RequestMapping(value="/listFood",method= RequestMethod.GET)
    public JSONObject listFood(){
        return productionService.listFood();
    }

    @ApiOperation(value = "展示production表中的所有国家地区", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
    })
    @RequestMapping(value="/listCountry",method= RequestMethod.GET)
    public JSONObject listCountry(){
        return productionService.listCountry();
    }

    @ApiOperation(value = "根据食品或国家类型查询对应的值", httpMethod = "GET",
            notes = "响应说明:")
    @ApiImplicitParams({
            @ApiImplicitParam(required = false, name = "food_type", value="食品类型"),
            @ApiImplicitParam(required = false, name = "country", value="国家"),
    })
    @RequestMapping(value="/findByFoodAndCountry",method= RequestMethod.GET)
    public JSONObject findByCountryAndFood(@RequestParam(name = "food_type", required = false)String food_type,
                                           @RequestParam(name = "country", required = false)String country){
        return productionService.findByCountryAndFood(food_type, country);
    }
}
