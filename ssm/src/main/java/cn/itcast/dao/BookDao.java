package cn.itcast.dao;

import cn.itcast.domain.Book;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Select("select * from book")
    List<Book> findAll();

    @Update("update book set bookName=#{bookName} where id =#{id}")
    void update(Book book);
}
