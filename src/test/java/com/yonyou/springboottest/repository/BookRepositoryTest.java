package com.yonyou.springboottest.repository;

import com.yonyou.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

/**
 * @author lxt
 * @version 1.0
 * @date 2020-02-29 22:16
 */
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void findAll(){
        PageRequest pageRequest =PageRequest.of(3,3);
      Page page= bookRepository.findAll(pageRequest);
        int i=1;


    }
    @Test
    void Add(){
        Book book=new Book();
        book.setName("java");
        book.setAuthor("iii");
        Book book1=  bookRepository.save(book);
        System.out.println(book1);
    }
    @Test
    void  findById(){
        Integer integer=new Integer(1);

       Optional<Book> book= bookRepository.findById(integer);
       Book books= book.get();
    }

    void updateBook(){
        Book book =new Book();
        book.setId(5);
        book.setAuthor("ppp");
        book.setName("9898");
        bookRepository.save(book);
    }


}