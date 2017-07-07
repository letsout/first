package org.lxh.mvcdemo;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.lxh.mvcdemo.factory.BookDAOFactory;
import org.lxh.mvcdemo.vo.Book;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = null; //ʵ����books����
		try {
			books = BookDAOFactory.getInstance().findAll();//�������ݿ��ȡ����ֵ��ֵ��books
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("all", books); //��request�����м�����Ϊall�����Բ���ֵΪbooks
		request.getRequestDispatcher("/index.jsp").forward(request, response); //���������ݵ�Index.jsp
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
