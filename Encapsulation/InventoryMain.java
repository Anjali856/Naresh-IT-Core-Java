package com.oct_21_constructor_and_encapsulation;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Item name :");
		String name = sc.next();

		System.out.println("Enter Price Per Unit :");
		double unit = Double.parseDouble(sc.next());

		System.out.println("Quantity in Stock: ");
		int stock = Integer.parseInt(sc.next());

		InventoryItem i = new InventoryItem(name, unit, stock);
		
		System.out.println("Total Inventory Value: "+i.calculateTotalValue());

		System.out.println("Any updation in Stock Price OR Quantity :");
		String updation = sc.next();
		System.out.println("Updated Inventory Item Details:");
		if (updation.equalsIgnoreCase("yes")) {
			
             System.out.println("Item Name");
             String name1 = sc.next();
             i.setItemName(name1);
             
             System.out.println("Price Per Unit :");
			double unit1 = Double.parseDouble(sc.next());
			i.setPricePerUnit(unit1);
			
			System.out.println("Quantity in Stock: ");
			int stock1 = Integer.parseInt(sc.next());
			i.setQuantityInStock(stock1);
			 
			System.out.println("Total Inventory Value: "+i.calculateTotalValue());
			

		} else {
			System.exit(0);
		}

	}

}
