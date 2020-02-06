package ch5Assmt;

public class seasons {
	public static void main(String[] args) {
		seasons(1,2);
			
	};
	
	public static void seasons(int month, int day) {
	String season = ""; 
	       if(month == 12 && day > 15|| month >= 1 && month < 3 || month == 3 && day < 16){
	           season = "Winter";
	           //return season;
	       }else if(month == 3 && day> 15 || month> 3 && month< 6 || month == 6 && day< 16){
	           season = "Spring";
	           //return season;
	       }else if(month ==6 && day> 15 || month> 6 && month< 9 || month == 9 && day< 16){
	           season = "Summer";
	           //return season;
	       }else if(month ==9 && day> 15 || month> 9 && month< 12 || month == 12 && day< 16){
	           season = "Fall";
	          // return season;
	       }
	    //return season;
	  };
}