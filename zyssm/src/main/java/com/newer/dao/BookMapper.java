package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @author shining
 *
 */
@Repository
public interface BookMapper {
	
	@Insert("insert into bookinfo values(null,#{title},#{price},#{author.auid})")
	int addBook(Book book);
	
	@Update("update bookinfo set title=#{title},price=#{price},"
			+ "auid=#{author.auid} where bookid=#{bookId}")
	int updateBook(Book book);
	
	@Delete("delete from bookinfo where bookid=#{bookId}")
	int deleteBook(@Param("bookId") int bookId);
	
	@Select("select * from bookinfo where bookid=#{bookId}")
	Book findById(@Param("bookId") int bookId);
	
	@Results(value= {@Result(id=true,property="bookId",column="bookid"),
			@Result(property="title",column="title"),
			@Result(property="price",column="price"),
			@Result(property="author",column="auid",
			javaType=com.newer.pojo.Author.class,
			one=@One(select="com.newer.dao.AuthorMapper.findById"))})
	@Select("select * from bookinfo")
	List<Book> findAll();

	@ResultMap(value="com.newer.dao.BookMapper.book1")
	@Select("select bookid,title,price,b.auid,name "
			+ "from bookinfo b left join author a on b.auid=a.auid")
	List<Book> findAll2();
	
	
}
