package com.bee.address.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bee.address.pojo.MallComment;

import java.util.List;
@Mapper
public interface MallCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallComment record);

    MallComment selectByPrimaryKey(Integer id);

    List<MallComment> selectAll();

    int updateByPrimaryKey(MallComment record);
    //根据用户id和商品id联合查询评价
    MallComment selectByUserIdProId(@Param("comUserId") Integer comUserId,@Param("comProId")Integer comProId);
    //根据用户id查找评价
    MallComment findCommentByUserId(Integer comUserId);
}