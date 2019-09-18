package cn.sz.lwt.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OraclePaging {
	public void paging(Map<String,Object> map);
}
