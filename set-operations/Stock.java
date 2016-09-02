package org.creators;

public class Stock implements Comparable<Stock> {
	private int itemNumber;
	private String itemName;
	private int quantity;
	private double price;
	private String manufacturer;
	private String dateOfManufatured,dateOfExpiry;
	public Stock(int itemNumber, String itemName, int quantity, double price, String manufacturer) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	public Stock(int itemNumber) {
		this.itemNumber=itemNumber;
		// TODO Auto-generated constructor stub
	}
	
	public void setItemNumber(int itemNumber){
		this.itemNumber=itemNumber;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDateOfManufatured() {
		return dateOfManufatured;
	}
	public void setDateOfManufatured(String dateOfManufatured) {
		this.dateOfManufatured = dateOfManufatured;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String toString() {
		//return itemNumber+"\t"+itemName+"\t"+quantity+"\t"+price+"\t"+manufacturer+"\t"+this.dateOfManufatured+"\t"+this.dateOfExpiry;
		return "Stock [itemNumber=" + itemNumber + ", itemName=" + itemName + ", quantity=" + quantity + ", price="
				+ price + ", manufacturer=" + manufacturer + ", dateOfManufatured=" + dateOfManufatured
				+ ", dateOfExpiry=" + dateOfExpiry + "]";
	}
	@Override
	public int compareTo(Stock o) {
		// TODO Auto-generated method stub
		return ((Integer)this.getItemName().compareTo(o.getItemName()));
	}

	
 }
