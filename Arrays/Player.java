
import java.util.Scanner;

class Player {
	private int id;
	private String name;
	private double price;
	

	public Player(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Player Object:");
		int size=Integer.parseInt(sc.nextLine());
		
		Player players[]=new Player[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Player ID :");
			int id= Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Player Name :");
			String name=sc.nextLine();
			
			System.out.println("Enter Player Base price :");
			double price=Double.parseDouble(sc.nextLine());
			
			players[i]=new Player(id, name, price);
			
		}
		System.out.println("Printing the Player Object :");
		for(Player player:players) {
			System.out.println(player);
		}
		
	sc.close();
	}
}
