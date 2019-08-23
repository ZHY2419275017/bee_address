package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallOrderItem;

import java.util.List;
@Mapper
public interface MallOrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallOrderItem record);

    MallOrderItem selectByPrimaryKey(Integer id);

    List<MallOrderItem> selectAll();

    int updateByPrimaryKey(MallOrderItem record);
}