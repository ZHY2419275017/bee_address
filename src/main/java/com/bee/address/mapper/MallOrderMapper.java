package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallOrder;

import java.util.List;
@Mapper
public interface MallOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallOrder record);

    MallOrder selectByPrimaryKey(Integer id);

    List<MallOrder> selectAll();

    int updateByPrimaryKey(MallOrder record);
}