package com.example.demo.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Books_Details;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
@Autowired
BookRepository bookRepository;

//getAll

public List<Books_Details> fetchAllBooks() {
    List<Books_Details> allBooks = (List<Books_Details>) bookRepository.findAll();
    return allBooks;
}

//get
public Books_Details getBooksById(int id)   
{    
return bookRepository.findById(id).get();

}  
//post
public Books_Details saveOrUpdate(Books_Details books)   
{  
	return bookRepository.save(books);  
}  
//delete
public void delete(int id)   
{  
	bookRepository.deleteById(id);  
}   

//public int getBooksById() {
//	return 0;
//}

public void saveOrUpdate(Books_Details booksdetails,int id, String name) {
	bookRepository.save(booksdetails);
}  
}
