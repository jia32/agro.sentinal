package com.pwc.agro.sentinal.dao;

import com.pwc.agro.sentinal.dto.Price;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriceDAO {
    List<String> listFoodType(@Param("group") Integer group);
    List<String> listCountry(@Param("group") Integer group);
    List<Price> findByCountryAndFood(@Param("food") String food, @Param("country") String country);
}
