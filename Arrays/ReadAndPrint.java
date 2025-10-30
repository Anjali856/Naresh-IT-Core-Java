public class ReadAndPrint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your size:");
		int n=sc.nextInt();
		System.out.println("Enter Your Element:");
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}

}
