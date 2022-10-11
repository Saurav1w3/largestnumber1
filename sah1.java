package jdbc;
public class sah1 {
	public static void main(String[]args) {
	/*int m= 9;
	int n=6;
	m=m+1;
	n=n-1;
	m=m+n;
	if(m>n) {
		System.out.println(m);
	}else
		System.out.println(n);*/
	/*int a=50;
	int b=2;
	a=a+b;
	b=a-b;
	System.out.println(a);
	System.out.println(b);*/
		int a=10;
		int b=4;
		int i;
		if(a>b) {
			if(a+b>14) {
				System.out.println(a);
			}
			else {
				for(int j=1;j<3;j++) {
					a=a+j;
					System.out.println(a);
				} 
			}
		}
		else {
			System.out.println(b);
		}
	}
}