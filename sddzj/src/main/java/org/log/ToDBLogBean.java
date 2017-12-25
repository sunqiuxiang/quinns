package org.log;

import java.util.Date;

/**
 * @author lixiang
 *
 */
public class ToDBLogBean {
	private Date log_time;
	private String event;
	private String event_producer;
	private String event_customer;
	private int remark01;
	private String remark02;
	public ToDBLogBean(Date log_time, String event, String event_producer, String event_customer, int remark01,
			String remark02) {
		super();
		this.log_time = log_time;
		this.event = event;
		this.event_producer = event_producer;
		this.event_customer = event_customer;
		this.remark01 = remark01;
		this.remark02 = remark02;
	}
	
	
	public ToDBLogBean(Date log_time, String event, String event_producer, String event_customer) {
		this(log_time,event,event_producer,event_customer,0,"");
	}


	public ToDBLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getLog_time() {
		return log_time;
	}
	public void setLog_time(Date log_time) {
		this.log_time = log_time;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent_producer() {
		return event_producer;
	}
	public void setEvent_producer(String event_producer) {
		this.event_producer = event_producer;
	}
	public String getEvent_customer() {
		return event_customer;
	}
	public void setEvent_customer(String event_customer) {
		this.event_customer = event_customer;
	}
	public int getRemark01() {
		return remark01;
	}
	public void setRemark01(int remark01) {
		this.remark01 = remark01;
	}
	public String getRemark02() {
		return remark02;
	}
	public void setRemark02(String remark02) {
		this.remark02 = remark02;
	}
	@Override
	public String toString() {
		return "ToMysqlLogBean [log_time=" + log_time + ", event=" + event + ", event_producer=" + event_producer
				+ ", event_customer=" + event_customer + ", remark01=" + remark01 + ", remark02=" + remark02 + "]";
	}
	
	
}
