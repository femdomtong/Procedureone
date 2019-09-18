package cn.sz.lwt.service;

import java.util.Map;

import cn.sz.lwt.pojo.MyUser;
import cn.sz.lwt.pojo.TestProcedure;
import cn.sz.lwt.pojo.TestProcedureDate;

public interface ProcedureService {
	public void callProcedure(TestProcedure testProcedure);
	public MyUser queryUser(Integer userid);
	public void callProcedureDate(TestProcedureDate testProcedureDate);
	public void paging(Map<String,Object> map);
}
