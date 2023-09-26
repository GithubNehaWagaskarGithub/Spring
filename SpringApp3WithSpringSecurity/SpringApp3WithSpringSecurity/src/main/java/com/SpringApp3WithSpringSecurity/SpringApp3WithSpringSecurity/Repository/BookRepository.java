package com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Repository;

import com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>
{

}
