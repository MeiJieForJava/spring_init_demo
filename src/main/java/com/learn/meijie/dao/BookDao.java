package com.learn.meijie.dao;

import java.util.List;

import com.learn.meijie.entity.Book;
import org.apache.ibatis.annotations.Param;

/**
 * @author meijie 2018-02-11
 */
public interface BookDao {

    Book queryById(long id);

    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    int addBook(Book book);

    int updateBook(Book book);

    int deleteBookById(long id);
}