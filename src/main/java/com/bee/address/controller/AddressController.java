package com.bee.address.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bee.address.mapper.MallUserMapper;
import com.bee.address.pojo.MallAddress;
import com.bee.address.pojo.MallUser;
import com.bee.address.service.IAddressService;


@Controller
@RequestMapping(value="/address")
@RestController
public class AddressController {
	
	@Autowired
	private IAddressService addressService;
	
	@Autowired
	private MallUserMapper userMapper;
	
	private final static Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	/**
	 * 根据用户id查找该用户的所有 收货地址 
	 * @param userId
	 * @return MallAddress
	 */
	@GetMapping(value="/selectAddressByUsername")
	public List<MallAddress> selectAddressByUserId(String username){
		logger.info("selectAddressByUsername被访问");
		if(!StringUtils.isEmpty(username)){
			MallUser user = userMapper.selectUserByUsername(username);
			return addressService.selectAddressByUserId(user.getId());
		}else{
			return null;
		}
		
	}
	
	@GetMapping(value="/selectAddressById")
	public MallAddress selectAddressById(Integer id){	
		return addressService.selectAddressById(id);
	}
	/**
	 * 新增收货地址
	 * @param mallAddress
	 * @return 成功返回"success",失败返回 "error"
	 */
	@PostMapping(value="/add")
	public String AddAddress(MallAddress mallAddress){
		logger.info("add被访问");
		return addressService.addAddress(mallAddress);		
	}
	/**
	 * 根据地址id 删除地址
	 * @param id
	 * @return 成功返回"success",失败返回 "error"
	 */
	@DeleteMapping(value="/delete")
	public String delete(Integer id){
		logger.info("delete被访问");
		return addressService.delectAddress(id);		
	}
	/**
	 * 更新地址
	 * @param mallAddress
	 * @return 成功返回"success",失败返回 "error"
	 */
	@PostMapping(value="/update")
	public String update(MallAddress mallAddress){
		logger.info("update被访问");
		return addressService.updateAddress(mallAddress);		 
	}

}
