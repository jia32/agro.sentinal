package com.pwc.agro.sentinal.dao;


import com.pwc.agro.sentinal.dto.PriceList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriceListDAO {
    List<String> listFoodType(@Param("group") Integer group);
    List<PriceList> findByFood(@Param("food") String food);
}
