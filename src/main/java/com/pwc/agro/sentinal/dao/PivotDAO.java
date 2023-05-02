package com.pwc.agro.sentinal.dao;

import com.pwc.agro.sentinal.dto.Pivot;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PivotDAO {
    List<String> listFoodType(@Param("group") Integer group);
    List<Pivot> findByFood(@Param("food") String food);
}
