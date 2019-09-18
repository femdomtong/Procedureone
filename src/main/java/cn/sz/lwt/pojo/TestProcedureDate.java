package cn.sz.lwt.pojo;

import java.io.Serializable;
import java.util.Date;

public class TestProcedureDate implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date in_str;
	private Date out_str;
	public Date getIn_str() {
		return in_str;
	}
	public void setIn_str(Date in_str) {
		this.in_str = in_str;
	}
	public Date getOut_str() {
		return out_str;
	}
	public void setOut_str(Date out_str) {
		this.out_str = out_str;
	}
	
}
