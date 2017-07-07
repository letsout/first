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
		List<Book> books = null; //实例化books对象
		try {
			books = BookDAOFactory.getInstance().findAll();//讲从数据库获取到的值赋值给books
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("all", books); //在request对象中加入名为all的属性并附值为books
		request.getRequestDispatcher("/index.jsp").forward(request, response); //将参数传递到Index.jsp
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
