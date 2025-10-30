import java.util.Scanner;
//1 2 3 4 5
//5 2 3 4 1
//5 4 3 2 1
public class PrintReverseArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Size :");
		int n= sc.nextInt();
		System.out.println("Enter Your Elements:");
		int arr[]= new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse Array are:");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<n/2;i++) {//0
			int temp=arr[i];//temp=1
			arr[i]=arr[n-i-1];//arr[0]=5
			arr[n-i-1]=temp;//arr[4]=1
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
}
}
