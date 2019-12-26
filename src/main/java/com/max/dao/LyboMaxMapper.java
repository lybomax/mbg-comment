package com.max.dao;

import com.max.pojo.LyboMax;
import java.util.List;

public interface LyboMaxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LyboMax record);

    LyboMax selectByPrimaryKey(Integer id);

    List<LyboMax> selectAll();

    int updateByPrimaryKey(LyboMax record);
}