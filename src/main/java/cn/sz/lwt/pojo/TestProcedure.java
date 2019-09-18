package cn.sz.lwt.pojo;

import java.io.Serializable;

public class TestProcedure implements Serializable {

	private static final long serialVersionUID = 1L;
	private  String in_str;
	private String out_str;
	public String getIn_str() {
		return in_str;
	}
	public void setIn_str(String in_str) {
		this.in_str = in_str;
	}
	public String getOut_str() {
		return out_str;
	}
	public void setOut_str(String out_str) {
		this.out_str = out_str;
	}
	
}
