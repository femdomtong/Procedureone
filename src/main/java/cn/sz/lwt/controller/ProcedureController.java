package cn.sz.lwt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sz.lwt.pojo.MyUser;
import cn.sz.lwt.pojo.TestProcedure;
import cn.sz.lwt.pojo.TestProcedureDate;
import cn.sz.lwt.service.ProcedureService;

@Controller
@RequestMapping("/pc")
public class ProcedureController {
	@Autowired
	private ProcedureService service;
	//普通存储过程调用
	@RequestMapping("callProcedure")
	public void callProcedure() {
		TestProcedure testProcedure = new TestProcedure();
		testProcedure.setIn_str("18");
		//调用和回调
		service.callProcedure(testProcedure);
		
		System.out.println(testProcedure.getOut_str());
		}
	//日期类存储过程调用
	@RequestMapping("callProcedureDate")
	public void callProcedureDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = "2019-09-10";
		Date date = sdf.parse(dateString);
		TestProcedureDate testProcedureDate = new TestProcedureDate();
		testProcedureDate.setIn_str(date);
		//调用和回调
		service.callProcedureDate(testProcedureDate);
		Date out_str = testProcedureDate.getOut_str();
		
		System.out.println(sdf.format(out_str));
	}
	
	@RequestMapping("queryUser")
	public void queryUser() {
		MyUser queryUser = service.queryUser(1);
		System.out.println(queryUser.getLoginName());
	}
}
