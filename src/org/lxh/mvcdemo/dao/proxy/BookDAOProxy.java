package org.lxh.mvcdemo.dao.proxy;

import java.util.*;
import org.lxh.mvcdemo.dao.BookDAO;
import org.lxh.mvcdemo.dao.impl.BookDAOImpl;
import org.lxh.mvcdemo.dbc.DatabaseConnection;
import org.lxh.mvcdemo.vo.Book;

public class BookDAOProxy implements BookDAO {
	private DatabaseConnection dbc = null;
	private BookDAO dao = null;
	public BookDAOProxy() {
		try {
			this.dbc = new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dao = new BookDAOImpl(dbc.getConnection());
	}

	// 查询全部
	public List<Book> findAll() throws Exception {
		List<Book> books = null;
		try {
			books = this.dao.findAll();
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.close();
		}
		return books;
	}

	// 关键字查询
	public List<Book> find(String keyword) throws Exception {
		List<Book> all = null;
		try {
			all = this.dao.find(keyword);
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.close();
		}
		return all;
	}

	// 添加
	public void add(Book book) throws Exception {
		try {
			this.dao.add(book);
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.close();
		}
	}

	// 删除
	public void delete(String del) throws Exception {
		try {
			this.dao.delete(del);
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.close();
		}
	}

	// 修改
	public void update(Book book) throws Exception {
		try {
			this.dao.update(book);
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.close();
		}
	}
}
