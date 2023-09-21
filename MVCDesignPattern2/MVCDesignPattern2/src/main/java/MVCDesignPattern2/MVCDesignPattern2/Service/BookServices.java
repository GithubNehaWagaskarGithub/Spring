package MVCDesignPattern2.MVCDesignPattern2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MVCDesignPattern2.MVCDesignPattern2.Model.Book;
import MVCDesignPattern2.MVCDesignPattern2.Repository.BookRepository;

@Service
public class BookServices implements BookService{

	@Autowired
	private BookRepository repository;

	@Override
	public List<Book> displayData()
	{
		return repository.findAll();
	}
	//-------------------------------------------

	@Override
	public void insertData(Book book) 
	{
		this.repository.save(book);
	}
	//-------------------------------------------

	@Override
	public Book updateDataById(int id) 
	{	
		Optional<Book> optional=repository.findById(id);
		Book book=null;
		if(optional.isPresent())
		{
			book=optional.get();		
		}
		else
		{
			throw new RuntimeException("Book Not Found :"+id);
		}
		return book;
	}
	//---------------------------------------------------------------

	@Override
	public void deleteDataById(int id)
	{
		repository.deleteById(id);
	}
	//-----------------------------------------------------------------
}
