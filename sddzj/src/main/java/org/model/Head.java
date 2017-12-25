package org.model;
public class Head {
	
	//台站总数
	  private int stasum;
	  public void setStasum(int stasum){
	     this.stasum = stasum;
	  }
	  public int getStasum(){
		     return this.stasum;
    }
	  
      // 数据开始时间
	  private int year;
	  private int month;
	  private int date;
	  private int hour;
	  private int min;
	  private int sec;
	  public void setYear(int year){
	     this.year = year;
	  }
	  public void setMonth(int month){
		     this.month = month;
		  }
	  public void setDate(int date){
		     this.date = date;
		  }
	  public void setHour(int hour){
		     this.hour = hour;
		  }
	  public void setMin(int min){
		     this.min = min;
		  }
	  public void setSec(int sec){
		     this.sec = sec;
		  }	  
	  public String getStartTime()
	  {
		  String st = this.year+"-"+this.month+"-"+this.date+" "+this.hour+":"+this.min+":"+this.sec;
		  return st;
	  }
	  
	  //记录长度
	  private int datasec;
	  public void setDatasec(int datasec){
	     this.datasec = datasec;
	  }
	  public int getDatasec(){
		     return this.datasec;
    }
	  
	  

}
