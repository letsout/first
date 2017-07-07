package org.lxh.mvcdemo.dao.impl;
import java.sql.*;
import java.util.*;
import org.lxh.mvcdemo.dao.BookDAO;
import org.lxh.mvcdemo.vo.Book;

public class BookDAOImpl implements BookDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public BookDAOImpl(Connection conn){
		this.conn = conn ;
	}
	//查询全部
	public List<Book> findAll() throws Exception {
		// TODO Auto-generate	
     List<Book> books =new ArrayList<Book>();
   	 String sql="SELECT bookid,bookname,booktype,bookauthor,bookisbn,bookprice"+" FROM book";
     this.pstmt=this.conn.prepareStatement(sql);//获取带参数的prepareStatement
     ResultSet rs =this.pstmt.executeQuery();//执行查询操作获取结果集
     while(rs.next()){
     	Book book =new Book();
     	book.setBookid(rs.getString(1));
     	book.setBookname(rs.getString(2));
     	book.setBooktype(rs.getString(3));
     	book.setBookauthor(rs.getString(4));
     	book.setBookisbn(rs.getString(5));
     	book.setBookprice(rs.getString(6));
     	books.add(book);
}
     this.pstmt.close();
     return books;
	}
	//d型查询 
	 public List<Book> find(String keyword) throws Exception{
 		List<Book> all =new ArrayList<Book>();
    	 String sql="SELECT bookid,bookname,booktype,bookauthor,bookisbn,bookprice"+" FROM book where  bookid=? ";
 	     this.pstmt=this.conn.prepareStatement(sql);//获取带参数的prepareStatement
 	      this.pstmt.setString(1,keyword);
       ResultSet rs =this.pstmt.executeQuery();//执行查询操作获取结果集
	        while(rs.next()){
	        	Book book =new Book();
	        	book.setBookid(rs.getString(1));
	        	book.setBookname(rs.getString(2));
	        	book.setBooktype(rs.getString(3));
	        	book.setBookauthor(rs.getString(4));
	        	book.setBookisbn(rs.getString(5));
	        	book.setBookprice(rs.getString(6));
	        	all.add(book);
	     }
	        this.pstmt.close();
	        return all;
}
	 //添加
	   public void add(Book book) throws Exception{
	    	  String sql="INSERT into book(bookid,bookname,booktype,bookauthor,bookisbn,bookprice)"+" values(?,?,?,?,?,?)";
	    	  this.pstmt =this.conn.prepareStatement(sql);//获取带参数的prepareStatement
	    	  this.pstmt.setString(1,book.getBookid());
	    	  this.pstmt.setString(2,book.getBookname());
	    	  this.pstmt.setString(3,book.getBooktype());
	    	  this.pstmt.setString(4,book.getBookauthor());
	    	  this.pstmt.setString(5,book.getBookisbn());
	    	  this.pstmt.setString(6,book.getBookprice());
	    	  this.pstmt.executeUpdate();//执行更新操作
	    	  this.pstmt.close();
	      }
	   //删除
    public void delete(String id) throws Exception{   
    	String sql ="Delete from book where bookid =?";
    	this.pstmt=this.conn.prepareStatement(sql);;//获取带参数的prepareStatement
    	this.pstmt.setString(1,id);
    	this.pstmt.executeUpdate();
    	this.pstmt.close();
      }
	//修改
    public void update(Book book) throws Exception{
  	  String sql="update book set bookname=?, booktype=? , bookauthor=?, bookisbn=?, bookprice=? where bookid=?";
  	  this.pstmt=this.conn.prepareStatement(sql);;//获取带参数的prepareStatement
  	  this.pstmt.setString(1,book.getBookname());
  	  this.pstmt.setString(2,book.getBooktype());
  	  this.pstmt.setString(3,book.getBookauthor());
  	  this.pstmt.setString(4,book.getBookisbn());
  	  this.pstmt.setString(5,book.getBookprice());
  	  this.pstmt.setString(6,book.getBookid());
  	  this.pstmt.executeUpdate();//执行更新操作
  	  this.pstmt.close();	  
    }
}

