/*
 * Developer: Dennis van der Vlugt
 * Studentnumber: 418679
 * 
 * HogeSchool InHolland
 * 
 * Java 2
 * 
 * "Frisdrankautomaat" 
 * 
 */

import java.util.ArrayList;

/*
 * Class: WareHouse
 * 
 * Handles stock of all added products
 * 
 */

public class WarehouseStockHandler {

	private ArrayList<Product> m_ProductList;
	
	public WarehouseStockHandler()
	{
		m_ProductList = new ArrayList<Product>();
	}
	
	public void addProduct(Product product, int amount)
	{
		product.addStock(amount);
		m_ProductList.add(product);
	}
	
	public int getStockAmount(String productName)
	{
	      int listID = getProductListId(productName);
	      
	      Product product = m_ProductList.get(listID);
	      
	      return product.getStockAmount(); 
	}
	
	public void changeStock(String productName, int amount) 
	{
		int listId = getProductListId(productName);
		
		Product product = m_ProductList.get(listId);
			      
	    product.addStock(amount); 		
	}
	
	public Product getProduct(String productName)
	{
		int listId = getProductListId(productName);
		
		Product product = m_ProductList.get(listId);
		
		return product;
	}
	
	public ArrayList<Product> getAllProducts()
	{
		return m_ProductList;
	}
	
	private int getProductListId(String productName)
	{
           for (int i = 0; i < m_ProductList.size(); i++)
           {           
               Product product = m_ProductList.get(i);               
                            
               if(productName == product.getName())
               {                   
                   return i;
               }
       		}
           return 0;
	}	
}
