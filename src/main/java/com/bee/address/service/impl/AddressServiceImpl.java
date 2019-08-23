package com.bee.address.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.address.mapper.MallAddressMapper;
import com.bee.address.pojo.MallAddress;
import com.bee.address.service.IAddressService;
@Service
public class AddressServiceImpl implements IAddressService {
	@Autowired
	private MallAddressMapper addressMapper;

	@Override
	public List<MallAddress> selectAddressByUserId(Integer userId) {
		return addressMapper.selectAddressByUserId(userId);
	}

	@Override
	public String addAddress(MallAddress mallAddress) {
		mallAddress.setCreateTime(new Date());
		mallAddress.setUpdateTime(new Date());
		int result = addressMapper.insert(mallAddress);	
		return (result>0?"success":"error");
	}

	@Override
	public String delectAddress(Integer id) {
		int result = addressMapper.deleteByPrimaryKey(id);	
		return (result>0?"success":"error");
	}

	@Override
	public String updateAddress(MallAddress mallAddress) {	
		mallAddress.setUpdateTime(new Date());
		int result = addressMapper.updateByPrimaryKeySelective(mallAddress);
		return (result>0?"success":"error");
	}

}
