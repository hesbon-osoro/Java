package assignment;
/*
 * @author Hesbon Osoro
 * * Creates a program to keep track of items sold in a 
 * multi-storied electronics showroom
 * for items of different categories and displays if 
 * the item is checked out.
 *

 */
class StoreCatalogue{
	/* private instance variables*/
	private double price;
	private String itemName;
	private int productId;
	private boolean checkedout;
	private String category;
	/**
	 * Creates a class constructor StoreCatalogue with specified name
	 * @param cate, name, pid and cost 
	 */

public StoreCatalogue(String cate, String name, int pid, double cost) {
	this.itemName=name;
	this.productId=pid;
	this.price=cost;
	this.category=cate;
}
/*
 *setter method for checkedout item
 *@parama flag The value true or false indicating if item is checked out
  */
public void isChecked(boolean flag) {
	checkedout=flag;
}
/*
 * getter method for checkedout item 
 * @return checkedout
 */
public boolean getChecked() {
	return checkedout;
}
/*
 * method for displaying Showroom items
 */
public void showItems() {
	System.out.println("Category: "+category);
	System.out.println("Name: "+itemName);
	System.out.println("Product ID: "+productId);
	System.out.println("Item Price: "+price);
	System.out.println("Checked Out: "+checkedout);
	System.out.println();
}
}
public class MSElectronics {

	public static void main(String[] args) {
		/*
		 * instantiating objects of the class StoreCatalogue
		 */
		StoreCatalogue sc=new StoreCatalogue("Visual","Monitor", 5, 12000);
		StoreCatalogue sc1=new StoreCatalogue("Gadget","Laptop", 8, 100000);
		StoreCatalogue sc2=new StoreCatalogue("Audio","Speaker", 12, 500.5);
		StoreCatalogue sc3=new StoreCatalogue("Power","Battery", 50, 3000.5);
		sc.isChecked(true);
		sc.getChecked();
		sc.showItems();
		
		sc1.isChecked(true);
		sc1.getChecked();
		sc1.showItems();
		
		sc2.isChecked(true);
		sc2.getChecked();
		sc2.showItems();
		
		sc3.isChecked(false);
		sc3.getChecked();
		sc3.showItems();

	}

}

