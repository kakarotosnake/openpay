package mx.com.switz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.switz.client.BookServiceClient;
import mx.com.switz.dto.Book;


@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookServiceClient bookServiceClient;
	
	
@GetMapping
public List<Book> getAll(){
	
	return bookServiceClient.getBooks();
	
}

}
