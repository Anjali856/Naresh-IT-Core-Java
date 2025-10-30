import java.util.Scanner;

public class LastAndFirstDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Your Size:");
	   int n= sc.nextInt();
	   System.out.println("Enter Your Element:");
	   int arr[]= new int[n];
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int f=arr[0];
	   int l=arr[arr.length-1];
	   int sum=f+l;
	   System.out.println("Sum Array is:"+sum);
}

}
