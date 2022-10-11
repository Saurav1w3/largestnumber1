package jdbc;
public class largestnumber {
public static void main(String[]args) {
	int arr[]=new int [] {2,8,12,44,78,1,88};
	int smallest =arr [0];
	int largest =arr[0];
	for (int i=1;i<arr.length;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}else if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	System.out.println("smallest number is"+ smallest);
	System.out.println("largest number is "+ largest);
}
}
