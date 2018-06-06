package com.restprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/")
	public List<Book> listAll(){
		return Arrays.asList(new Book(1, "Test", "Antonella Solomon"));
	}
	
	@GetMapping("/test")
	public Book test(@RequestParam("id") String id){
		System.out.println(id);
		return new Book(1, "Test", "Antonella Solomon");
	}
	
	@GetMapping("/test2")
	public List<Book> test2(@RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("author") String author){
		ArrayList<Book> b= new ArrayList<>();
		b.add(new Book(1, "Test", "Antonella Solomon"));
		b.add(new Book(id,title,author));
		System.out.println(id);
		return b;
	}

}
