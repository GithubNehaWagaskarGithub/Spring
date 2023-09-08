package SpringApp1.SpringApp1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import SpringApp1.SpringApp1.Model.Product;

@Component
@Service
public class ProductService {
	@Autowired
	private Product product;
	
	List<Product> productList=new ArrayList<>();
	
	{
		productList.add(new Product(101,"Mobile",45999.99));
		productList.add(new Product(102,"Laptop",35999.99));
	}
	//---------------------------------------------------------------
	public List<Product> displayData()
	{
		return productList;
	}
	//----------------------------------------------------------------
	public Product displayOneData(int id)
	{
		Product temp=null;
		for(Product p:productList)
		{
			if(p.getProductId()==id)
			{
				temp=p;
				break;
			}
		}
		return temp;
	}
	//------------------------------------------------------------------	
	public String addProduct(Product p)
	{
		if(productList.add(p))
		{
			return "Added Sucessfully";
		}
		else
		{
			return "Something Went Wrong";
		}
	}
	//------------------------------------------------------------------
	public Product displayProductByName(String name) 
	{
		Product temp=null;
		for(Product p:productList)
		{
			if(p.getProductName().equalsIgnoreCase(name))
			{
				temp=p;
				break;
			}
		}
		return temp;
	}
	//--------------------------------------------------------------------
	public String updateDataById(int id,double price)
	{
		boolean status=false;
		for(Product p:productList)
		{
			if(p.getProductId()==id)
			{
				p.setProductPrice(price);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Updated Sucessfully";
		}
		else
		{
			return "Not Updated";
		}
	}
	//----------------------------------------------------------------------
	public String deleteDataById(int id)
	{
		boolean status=false;
		for(Product p:productList)
		{
			if(p.getProductId()==id)
			{
				productList.remove(p);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Deleted Sucessfully";
		}
		else
		{
			return "Not Updated";
		}
	}
}
