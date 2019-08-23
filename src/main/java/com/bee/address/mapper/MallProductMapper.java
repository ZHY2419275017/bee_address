package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallProduct;

import java.util.List;
@Mapper
public interface MallProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallProduct record);

    MallProduct selectByPrimaryKey(Integer id);

    List<MallProduct> selectAll();

    int updateByPrimaryKey(MallProduct record);
}