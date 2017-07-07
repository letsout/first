package org.lxh.mvcdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.lxh.mvcdemo.factory.BookDAOFactory;
import org.lxh.mvcdemo.vo.Book;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Book book = new Book();//实例化book对象
		book.setBookid(request.getParameter("bookid"));// 图书编号
		book.setBookname(request.getParameter("bookname"));
		book.setBooktype(request.getParameter("booktype"));
		book.setBookauthor(request.getParameter("bookauthor"));
		book.setBookisbn(request.getParameter("bookisbn"));
		book.setBookprice(request.getParameter("bookprice"));
		try {
			BookDAOFactory.getInstance().update(book);//调用修改方法
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("/H/Servlet");// 重定向到首页
	}

}
