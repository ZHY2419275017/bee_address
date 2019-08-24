package com.bee.address.service;

import java.util.List;

import com.bee.address.pojo.MallAddress;

public interface IAddressService {
	
	//根据用户id查找归属该用户的收货地址  
	List<MallAddress> selectAddressByUserId(Integer userId);	
	//新增收货地址
	String addAddress(MallAddress mallAddress);
	//根据id删除收货地址
	String delectAddress(Integer id);
    //更新收货地址
	String updateAddress(MallAddress mallAddress);
	//根据主键id查地址
	MallAddress selectAddressById(Integer id);
}
