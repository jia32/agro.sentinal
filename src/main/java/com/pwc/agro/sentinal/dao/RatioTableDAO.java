package com.pwc.agro.sentinal.dao;

import com.pwc.agro.sentinal.dto.Pivot;
import com.pwc.agro.sentinal.dto.RatioTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RatioTableDAO {
    List<String> listCountry(@Param("group") Integer group);
    List<RatioTable> findByCountry(@Param("country") String country);

}
