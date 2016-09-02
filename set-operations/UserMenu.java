package org.creators;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.*;

public class UserMenu {
	Set<Stock> users = new TreeSet<Stock>();

	Scanner input = new Scanner(System.in);
	public void select(){
		int choice;
		boolean flag=true;
		while(flag){
			System.out.print("1.Add item 2.Update 3.Delete 4.List items 5.exit\nchoice:");
			choice = input.nextByte();
			switch(choice){
				case 1:insertItem();break;
				case 2:updateItem();break;
				case 3:deleteItem();break;
				case 4:displayItems();break;
				case 5:flag=false;System.out.println("Thank you");break;
			}
		}
	}
	
	public void insertItem(){
		Stock newStock = new Stock();
		System.out.print("Item Number:");
		newStock.setItemNumber(input.nextInt());input.nextLine();
		System.out.print("Item Name:");
		newStock.setItemName(input.nextLine());
		System.out.print("Quantity:");
		newStock.setQuantity(input.nextInt());
		System.out.print("Price:");
		newStock.setPrice(input.nextDouble());input.nextLine();
		System.out.print("Manufacturer:");
		newStock.setManufacturer(input.nextLine());
		System.out.print("Date of Manufacturing:");
		newStock.setDateOfManufatured(input.nextLine());
		System.out.print("Date of Expiry:");
		newStock.setDateOfExpiry(input.nextLine());
		
		users.add(newStock);
	}
	
	public void updateItem(){
		int itemNumber;
		System.out.print("Item number:");
		itemNumber = input.nextInt();
		boolean flag =false;
		for(Stock item:users){
			if(item.getItemNumber()==itemNumber){
				System.out.println("number exits");
				
				System.out.print("what do u wanna update\n1.Item Name 2.Quantity 3.Price 4.Manufacturer 5.Date of Manufature 6.Date of Expiry\nchoice:");
				byte choice;
				choice = input.nextByte();input.nextLine();
				switch(choice){
					case 1:System.out.print("Item Name:");item.setItemName(input.nextLine());break;
					case 2:System.out.print("Quantity:");item.setQuantity(input.nextInt());break;
					case 3:System.out.print("Price:");item.setPrice(input.nextDouble());break;
					case 4:System.out.print("Manufacturer:");item.setManufacturer(input.nextLine());break;
					case 5:System.out.print("Date of Manufacture:");item.setDateOfManufatured(input.nextLine());break;
					case 6:System.out.print("Date of Expiry:");item.setDateOfExpiry(input.nextLine());break;
				}
				
				flag=true;
				System.out.println("updated item\n"+item);
				break;
			}
		}
		if(flag==false)
			System.out.println("Invalid item Number");
			
	}
	public void deleteItem(){
		if(users.size()==0)
			System.out.println("No items Available");
		else{
			int itemNumber;
			System.out.print("Item number:");
			itemNumber = input.nextInt();
			boolean flag =false;
			for(Stock item:users){
				if(item.getItemNumber()==itemNumber){
					System.out.println("number exits");
					flag=true;
					users.remove(item);
					System.out.println("successfully removed");
					break;
				}
			}
			if(flag==false)
				System.out.println("Invalid item Number");
			}
	}
	public void displayItems(){
		System.out.println("ItemNumber\tItemName\tQuantity\tPrice\tManufacturer\tDate of Manufacture\tDateofExpiry");
		for(Stock value:users){
			System.out.println(value);
		
		}
	}
}
