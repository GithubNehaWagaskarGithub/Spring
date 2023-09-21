package MVCDesignPattern2.MVCDesignPattern2.Service;

import java.util.List;

import MVCDesignPattern2.MVCDesignPattern2.Model.Book;

public interface BookService 
{
	public List<Book> displayData();
	
	public void insertData(Book book);
	
	public Book updateDataById(int id);
	
	public void deleteDataById(int id);
}
