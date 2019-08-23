package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallCart;

import java.util.List;
@Mapper
public interface MallCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallCart record);

    MallCart selectByPrimaryKey(Integer id);

    List<MallCart> selectAll();

    int updateByPrimaryKey(MallCart record);
}