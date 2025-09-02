package day2;

public class Product {
	String ProductName;
	int Price;
	double Discount; 
	int Quantity;
	void display()
	{
		System.out.println("Product Name="+ProductName);
		System.out.println("Product Price="+Price);
		System.out.println("Product Discount="+Discount);
		System.out.println("Product Qunatity="+Quantity);
		
	}
	public static void mian(String args[])
	{
		Product p1=new Product();
		p1.ProductName="ICE CREAME";
		p1.Price=59;
		p1.Discount=20.0;
		p1.Quantity=1;
		Product p2=new Product();
		p2.ProductName="SHIRT";
		p2.Price=1999;
		p2.Discount=15.0;
		p2.Quantity=2;
		Product p3=new Product();
		p3.ProductName="SANDLES";
		p3.Price=1559;
		p3.Discount=50.0;
		p3.Quantity=1;
		p1.display();
		p2.display();
		p3.display();
		
	}

}
