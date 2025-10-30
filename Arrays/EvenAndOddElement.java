import java.util.Scanner;

public class EvenAndOddElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Size:");
		int n= sc.nextInt();
		System.out.println("Enter Your Elements :");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Even elements are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nOdd elements are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
