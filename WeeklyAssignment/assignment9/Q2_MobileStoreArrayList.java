package assignment9;

import java.util.ArrayList;
import java.util.Collections;

class Mobile implements Comparable<Mobile>
{
	String brand;
	String model;
	int price;
	
	Mobile(String brand,	String model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void display() {
        System.out.println(brand+" "+model+" "+price);
 }
	public int compareTo(Mobile ob) {
    	return (ob.price-this.price);
    }
}
public class Q2_MobileStoreArrayList {
	public static void main(String[] args) {
		ArrayList<Mobile> mobile=new ArrayList<>();
		
		mobile.add(new Mobile("Samsung","S23",70000));
		mobile.add(new Mobile("Apple","iPhone15", 80000));
		mobile.add(new Mobile("OnePlus" ,"12" ,60000));
		mobile.add(new Mobile("Vivo", "V30", 35000));
		mobile.add(new Mobile("Realme", "GT", 30000));
		
		System.out.println("Original Mobiles:");
		for(Mobile m:mobile)
		{
			m.display();
		}
		
		Collections.sort(mobile);
		System.out.println("\nAfter Sorting Descending:");
		for(Mobile m:mobile)
		{
			m.display();
		}
		
		mobile.remove(0);
		System.out.println("\nAfter Removing Most Expensive Mobile:");
		for(Mobile m:mobile)
		{
			m.display();
		}
		
		String searchName = "Ap";
        boolean found = false;
        
        for(Mobile m:mobile)
		{
        	if(m.brand.equalsIgnoreCase(searchName))
        		{
        		System.out.println("\nBrand Found: " +m.brand);
			found=true;
        		}
		}
        if (!found) {
            System.out.println("\nBrand Not Found");
        }
        
        for (Mobile m : mobile) {
            if (m.brand == "Samsung") {
                m.price = 68000;
            }
        }
        System.out.println("\nAfter Price Update:");
        for(Mobile m:mobile)
		{
			m.display();
		}
	}
	
}
