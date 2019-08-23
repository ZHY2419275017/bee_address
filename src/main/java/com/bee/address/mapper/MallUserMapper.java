package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.bee.address.pojo.MallUser;

import java.util.List;
@Mapper
public interface MallUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallUser record);

    MallUser selectByPrimaryKey(Integer id);

    List<MallUser> selectAll();

    int updateByPrimaryKey(MallUser record);
    
	MallUser selectUserByUsername(String username);
}