package com.example.demo.controller;
import com.example.demo.entity.Books_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
@Autowired
BookService bookService;

@GetMapping("/getAllbooks")
public java.util.List<com.example.demo.entity.Books_Details> getAllBooks() {
    return bookService.fetchAllBooks();
}

@GetMapping("/bookdetails/{id}")  
public Books_Details Books_Details (@PathVariable int id)   
{  
return bookService.getBooksById(id); 

}  

@DeleteMapping("/deletebook/{id}")  
public  String deleteBook(@PathVariable("id") int id)   
{  
	bookService.delete(id); 
	return "Deleted Successfully";
}  

@PostMapping("/save")
 public com.example.demo.entity.Books_Details  updates(@RequestBody Books_Details books){
	 return bookService.saveOrUpdate(books);
 }
 
 
@PutMapping("/updatebooks")  
public String update(@RequestBody Books_Details booksdetails )   
{  
	bookService.saveOrUpdate(booksdetails);  
return "updated successfully";  
}  
}