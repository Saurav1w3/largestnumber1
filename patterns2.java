package jdbc;
public class patterns2 {
public static void main(String[]args) {
	int m=4;
	int n=5;
	//outter loop
	for(int i=1;i<=m;i++) {
		//inner loop
		for (int j=1;j<=n;j++) {
			if (i==1 || j==1|| i==m||j==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
