package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookDaoTest {
   private BookDao bookDao=new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"帅帅","帅哥",new BigDecimal(22),1234,0,null));

    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21,"帅帅大家帅才是真的帅","帅哥",new BigDecimal(22),1234,0,null));
    }

    @Test
    public void queryBookById() {
    }

    @Test
    public void queryBooks() {
    }
}