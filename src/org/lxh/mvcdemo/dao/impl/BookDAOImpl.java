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
	//��ѯȫ��
	public List<Book> findAll() throws Exception {
		// TODO Auto-generate	
     List<Book> books =new ArrayList<Book>();
   	 String sql="SELECT bookid,bookname,booktype,bookauthor,bookisbn,bookprice"+" FROM book";
     this.pstmt=this.conn.prepareStatement(sql);//��ȡ��������prepareStatement
     ResultSet rs =this.pstmt.executeQuery();//ִ�в�ѯ������ȡ�����
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
	//d�Ͳ�ѯ 
	 public List<Book> find(String keyword) throws Exception{
 		List<Book> all =new ArrayList<Book>();
    	 String sql="SELECT bookid,bookname,booktype,bookauthor,bookisbn,bookprice"+" FROM book where  bookid=? ";
 	     this.pstmt=this.conn.prepareStatement(sql);//��ȡ��������prepareStatement
 	      this.pstmt.setString(1,keyword);
       ResultSet rs =this.pstmt.executeQuery();//ִ�в�ѯ������ȡ�����
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
	 //���
	   public void add(Book book) throws Exception{
	    	  String sql="INSERT into book(bookid,bookname,booktype,bookauthor,bookisbn,bookprice)"+" values(?,?,?,?,?,?)";
	    	  this.pstmt =this.conn.prepareStatement(sql);//��ȡ��������prepareStatement
	    	  this.pstmt.setString(1,book.getBookid());
	    	  this.pstmt.setString(2,book.getBookname());
	    	  this.pstmt.setString(3,book.getBooktype());
	    	  this.pstmt.setString(4,book.getBookauthor());
	    	  this.pstmt.setString(5,book.getBookisbn());
	    	  this.pstmt.setString(6,book.getBookprice());
	    	  this.pstmt.executeUpdate();//ִ�и��²���
	    	  this.pstmt.close();
	      }
	   //ɾ��
    public void delete(String id) throws Exception{   
    	String sql ="Delete from book where bookid =?";
    	this.pstmt=this.conn.prepareStatement(sql);;//��ȡ��������prepareStatement
    	this.pstmt.setString(1,id);
    	this.pstmt.executeUpdate();
    	this.pstmt.close();
      }
	//�޸�
    public void update(Book book) throws Exception{
  	  String sql="update book set bookname=?, booktype=? , bookauthor=?, bookisbn=?, bookprice=? where bookid=?";
  	  this.pstmt=this.conn.prepareStatement(sql);;//��ȡ��������prepareStatement
  	  this.pstmt.setString(1,book.getBookname());
  	  this.pstmt.setString(2,book.getBooktype());
  	  this.pstmt.setString(3,book.getBookauthor());
  	  this.pstmt.setString(4,book.getBookisbn());
  	  this.pstmt.setString(5,book.getBookprice());
  	  this.pstmt.setString(6,book.getBookid());
  	  this.pstmt.executeUpdate();//ִ�и��²���
  	  this.pstmt.close();	  
    }
}

