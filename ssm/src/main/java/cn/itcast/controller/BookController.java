package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){

        List<Book> list = bookService.findAll();

        ModelAndView mv = new ModelAndView("success");

        mv.addObject("list",list);

        return mv;
    }

    public void test (){
        System.out.println(1111);
    }

    @RequestMapping("/update")
    public ModelAndView update(Book book){

        book.setId(23);
        book.setBookName("456465");

        bookService.update(book);

        ModelAndView mv = new ModelAndView("success");

        mv.addObject("book",book);

        return mv;
    }


}
