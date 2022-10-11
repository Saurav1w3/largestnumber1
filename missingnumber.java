package jdbc;
public class missingnumber {
	static int arr[] ={3,45,8,44};
	public static void main(String[] args) {		
	}
static public void displaymissing() {
	System.out.println("given array");
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]+" ");
		System.out.println("number missing 1 to 100");
	}
	int j =0;
	for (int i=1;i<=100;i++) {
		if(j<arr.length && i==arr[j]) {
			j++;
			
		}else
			System.out.println(i+" ");		 
	} 
}
}
