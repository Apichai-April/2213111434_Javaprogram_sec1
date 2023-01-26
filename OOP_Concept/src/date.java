
public class date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	
	
	//The instance variables dmonth ,dDay,and dYear are set to the default
	
	public date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	public date(int month ,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
		
	}
	
	public void setdata(int month ,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMonth()+"-"+getDay() +"_"+getYear();
		
	}

	
		
	}
	
	
	
	
	
	














