package cn.sz.lwt.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.sz.lwt.pojo.TestProcedure;
import cn.sz.lwt.pojo.TestProcedureDate;
@Mapper
public interface Test {
	public void callProcedure(TestProcedure testProcedure);
	public void callProcedureDate(TestProcedureDate testProcedureDate);
}
