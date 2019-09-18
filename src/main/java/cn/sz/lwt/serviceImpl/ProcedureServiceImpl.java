package cn.sz.lwt.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lwt.dao.OraclePaging;
import cn.sz.lwt.dao.Test;
import cn.sz.lwt.dao.UserMapper;
import cn.sz.lwt.pojo.MyUser;
import cn.sz.lwt.pojo.TestProcedure;
import cn.sz.lwt.pojo.TestProcedureDate;
import cn.sz.lwt.service.ProcedureService;
@Service
public class ProcedureServiceImpl implements ProcedureService{
	@Autowired
	private Test dao;
	@Autowired
	private UserMapper userdao;
	@Autowired
	private OraclePaging paging;
	@Override
	public void callProcedure(TestProcedure testProcedure) {
		
		 dao.callProcedure(testProcedure);
	}
	
	public MyUser queryUser(Integer userid) {
		return userdao.queryUser(userid);
	}
	
	public void callProcedureDate(TestProcedureDate testProcedureDate) {
		 dao.callProcedureDate(testProcedureDate);
	}
	//分页
	public void paging(Map<String,Object> map) {
		paging.paging(map);
	}
}
