package jdbc;
import java.util.*;
public class forloop1 {
public static void main(String[]args) {
	System.out.println("table of 3");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	for (int i=3;i<=10;i++) {
		System.out.println(i*n);
	}
}
}
