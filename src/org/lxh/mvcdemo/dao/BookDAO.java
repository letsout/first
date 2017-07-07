package org.lxh.mvcdemo.dao;
import java.util.List;
import org.lxh.mvcdemo.vo.Book;

public interface BookDAO {
	public List<Book> findAll() throws Exception;// ����

	public List<Book> find(String keyword) throws Exception; // �ؼ��ֲ�ѯ

	public void add(Book book) throws Exception;// ���

	public void delete(String del) throws Exception;// ɾ��

	public void update(Book book) throws Exception; // �޸�
}
