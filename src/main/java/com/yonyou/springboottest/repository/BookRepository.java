package com.yonyou.springboottest.repository;

import com.yonyou.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lxt
 * @version 1.0
 * @date 2020-02-28 23:50
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
}
