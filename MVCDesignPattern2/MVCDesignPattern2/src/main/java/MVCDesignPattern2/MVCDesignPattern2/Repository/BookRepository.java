package MVCDesignPattern2.MVCDesignPattern2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MVCDesignPattern2.MVCDesignPattern2.Model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
