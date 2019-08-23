package com.bee.address.mapper;

import com.bee.address.pojo.MallAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MallAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallAddress record);

    MallAddress selectByPrimaryKey(Integer id);

    List<MallAddress> selectAll();

    int updateByPrimaryKey(MallAddress record);
    //根据用户id查找归属该用户的收货地址  
    List<MallAddress> selectAddressByUserId(Integer userId);
    
    int updateByPrimaryKeySelective(MallAddress record);
   
}