import java.util.*;
import java.util.Scanner;
 class Curd123 {

	private int productId;
	private String productName;
	private String productType;
	private String productcategory;
	private int productprice;
	
	
	
	public Curd123(int productId, String productName, String productType, String productcategory, int productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productcategory = productcategory;
		this.productprice = productprice;
	}
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
		public String getProductType() {
		return productType;
	}
	
	public String getProductcategory() {
		return productcategory;
	}
	
	

public int getProductprice() {
	return productprice;
}

public String toString()
{
	return productId+"  "+productName+"  "+productType+"   "+productcategory+"  "+productprice;
}

}

public class Curd
{
	

	public static void main(String[] args) {
		
		List <Curd123> c=new ArrayList<Curd123>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int ch;
		do {
			
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
		
			
			System.out.println("Enter Your Choice:");
			
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter productId: ");
				int productId=sc.nextInt();
				
				System.out.println("Enter productName: ");
				String productName=sc1.next();
				
				System.out.println("Enter productType: ");
				String productType=sc1.next();
				
				System.out.println("Enter productcategory: ");
				String productcategory=sc.next();

				System.out.println("Enter productPrice: ");
				int productPrice=sc.nextInt();

				
				c.add(new Curd123(productId,productName,productType,productcategory,productPrice));
				
				
				break;
			
				
			case 2:
				System.out.println("----------------------------------------");
				Iterator<Curd123> i=c.iterator();
				while(i.hasNext())
				{
					Curd123 cu=i.next();
					System.out.println(cu);
				}
				
				System.out.println("----------------------------------------");

				break;
				
			case 3:
				boolean found=false;
				System.out.println("Enter ProductId to Update ");
				int productId2=sc.nextInt();
				System.out.println("---------------");
				ListIterator<Curd123> li=c.listIterator();
				while(li.hasNext())
				{
					Curd123 cu=li.next();
					if(cu.getProductId()==productId2)
					{
						System.out.println("Enter the new ProductName:");
						 productName=sc1.nextLine();
						
						System.out.println("Enter the new ProductType:");
						 productType=sc1.nextLine();
						
						System.out.println("Enter the new ProductCategory:");
						 productcategory=sc1.nextLine();
						
						System.out.println("Enter the new ProductName:");
						 productPrice=sc.nextInt();
						 li.set(new Curd123(productId2,productName,productType,productcategory,productPrice));
						
						found=true;
					
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}else
				{
					System.out.println("Record is  Updated  Sucessfully");
				}
				
			
			    
		   	
			
			case 4:
				 found=false;
				System.out.println("Enter ProductId To Delete: ");
				int productId1=sc.nextInt();
				System.out.println("----------------------------------------");
				
				
				i=c.iterator();
				
				while(i.hasNext())
				{
				Curd123 cu=i.next();	
				if(cu.getProductId()==productId1)
				{
				i.remove();
				found=true;
				}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}else
				{
					System.out.println("Record is deleted Sucessfully");
				}
				
				
				System.out.println("----------------------------------------");
				break;
			}
			
		}while(ch!=0);
		
		
			
	}		
	
}