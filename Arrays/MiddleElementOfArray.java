
import java.util.Scanner;

public class MiddleElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Element Size:");
		int n = sc.nextInt();
		System.out.println("Enter Your Elements:");
		int arr[]= new int [n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		if(n%2!=0) {
			
			System.out.println("Middle Element is : "+arr[n/2]);
		}else {
			System.out.println("Middle element are : "+(arr[n/2]-1+" "+arr[n/2]));

		}
		
	}

}
