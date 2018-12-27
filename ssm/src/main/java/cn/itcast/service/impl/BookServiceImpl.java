package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

   @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {

        return bookDao.findAll();

    }

    @Override
    public void update(Book book) {

        bookDao.update(book);
    }
}
