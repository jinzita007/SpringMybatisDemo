package com.zyl.app.mapper;

import com.zyl.app.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> findAll();

    @Select("select * from book where id = #{id}")
    Book findOne(Long id);

    @Insert("insert into book (title, author) values (#{title}, #{author})")
    void save(Book book);

    @Update("update book set title = #{title}, author = #{author} where id = #{id}")
    void update(Book book);

    @Delete("delete from book where id = #{id}")
    void delete(Long id);
}
