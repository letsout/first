package org.lxh.mvcdemo.dao;
import java.util.List;
import org.lxh.mvcdemo.vo.Book;

public interface BookDAO {
	public List<Book> findAll() throws Exception;// 查找

	public List<Book> find(String keyword) throws Exception; // 关键字查询

	public void add(Book book) throws Exception;// 添加

	public void delete(String del) throws Exception;// 删除

	public void update(Book book) throws Exception; // 修改
}
