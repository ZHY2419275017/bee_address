package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallPayInfo;

import java.util.List;
@Mapper
public interface MallPayInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallPayInfo record);

    MallPayInfo selectByPrimaryKey(Integer id);

    List<MallPayInfo> selectAll();

    int updateByPrimaryKey(MallPayInfo record);
}