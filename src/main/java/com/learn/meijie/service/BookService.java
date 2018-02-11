package com.learn.meijie.service;

import com.learn.meijie.entity.Book;

import java.util.List;

/**
 * @author meijie
 */
public interface BookService {
  Book getById(long bookId);
  List<Book> getList(int start, int pageNum);
  int addBook(Book book);
  int updateBook(Book book);
  int deleteBookById(long id);
}