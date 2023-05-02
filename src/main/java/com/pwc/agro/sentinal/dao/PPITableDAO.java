package com.pwc.agro.sentinal.dao;
import java.util.List;

import com.pwc.agro.sentinal.dto.PPITable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper

public interface PPITableDAO {
    List<String> listFoodType(@Param("group") Integer group);
    List<PPITable> findByFood(@Param("food") String food);
}
