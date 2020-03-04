package com.yonyou.springboottest.controller;


import com.yonyou.springboottest.entity.Book;
import com.yonyou.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author lxt
 * @version 1.0
 * @date 2020-02-29 22:20
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") int page, @PathVariable("size") int size){
        PageRequest request=PageRequest.of(page,size);
        return bookRepository.findAll(request);
    }
    @PostMapping("/save")
    public String save(@RequestBody  Book book){
      Book rest = bookRepository.save(book);
      if(rest !=null){
          return "success";
      }else{
          return "error";
        }

    }
    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){

       return bookRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody  Book book){
        Book rest = bookRepository.save(book);
        if(rest !=null){
            return "success";
        }else{
            return "error";
        }

    }
   /* @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }*/

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }
}
