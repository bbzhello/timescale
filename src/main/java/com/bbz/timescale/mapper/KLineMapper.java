package com.bbz.timescale.mapper;

import com.bbz.timescale.entity.KLine;
import com.bbz.timescale.entity.KLineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KLineMapper {
    long countByExample(KLineExample example);

    int deleteByExample(KLineExample example);

    int insert(KLine record);

    int insertSelective(KLine record);

    List<KLine> selectByExample(KLineExample example);

    int updateByExampleSelective(@Param("record") KLine record, @Param("example") KLineExample example);

    int updateByExample(@Param("record") KLine record, @Param("example") KLineExample example);
}