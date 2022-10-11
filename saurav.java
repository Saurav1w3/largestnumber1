package jdbc;
public class saurav {
	//static variable 
static int a =40;
//instance variable 
int b= 50;
void simpledisplay () {
	System.out.println(a);
	System.out.println(b);	
}
//decleration of a static method 
static void staticdisplay () {
	System.out.println(a);
}
//main
public static void main (String []args) {
	saurav obj= new saurav();
	obj.simpledisplay();
	staticdisplay();
}
}
