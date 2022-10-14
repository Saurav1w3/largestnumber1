package jdbc;
public class leepyearcode {
	public static void main(String[]args) {
		int year=2022;
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){ 
			System.out.println("leep year");
			
			 }else
		System.out.println("not leep years");
		 }
}
