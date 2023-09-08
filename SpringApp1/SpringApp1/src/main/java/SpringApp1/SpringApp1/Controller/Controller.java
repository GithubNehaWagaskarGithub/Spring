package SpringApp1.SpringApp1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SpringApp1.SpringApp1.Model.Product;
import SpringApp1.SpringApp1.Service.ProductService;

@org.springframework.stereotype.Controller
@ResponseBody
//@RestController - we can use @RestConroller instead of @Controller and @ResponceBody.
//It is an combination of Both( @Controller + @ResponceBody ).
public class Controller {
	
	@GetMapping("/demo")
	public String message() {
		return "First Spring MVC Application";
	}
	//--------------------------------------------------------------------------------
	@Autowired
	private ProductService productService;
	
	@GetMapping("/productData")//@GetMapping is used for to display data
	public List<Product> displayAllProduct()
	{
		return productService.displayData();
	}
	//--------------------------------------------------------------------------------
	@GetMapping("/productData/{id}")
	public Product displayOneProduct(@PathVariable int id)
	{
		return productService.displayOneData(id);
	}
	//--------------------------------------------------------------------------------
	@PostMapping("/addData")//for adding data in List
	public String addData(@RequestBody Product p)
	{
		return productService.addProduct(p);
	}
	//--------------------------------------------------------------------------------
	@GetMapping("/productDatas/{pName}")//for display Data by Name
	public Product displayProdictByName(@PathVariable(value="pName") String name)
	{
		return productService.displayProductByName(name);
	}
	//--------------------------------------------------------------------------------
	@PutMapping("/updateData")//for updating data
	public String updateProductById(@RequestParam int id,@RequestParam double price)
	{
		return productService.updateDataById(id, price);
	}
	//--------------------------------------------------------------------------------
	@DeleteMapping("/deleteData")// for deleting Data
	public String deleteProductById(@RequestParam int id)
	{
		return productService.deleteDataById(id);
	}
}
