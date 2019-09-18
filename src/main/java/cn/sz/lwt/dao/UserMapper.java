package cn.sz.lwt.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.sz.lwt.pojo.MyUser;

@Mapper
public interface UserMapper {
	public MyUser queryUser(Integer userid);
}
