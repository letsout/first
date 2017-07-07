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
 * Servlet implementation class DelectServclet
 */
@WebServlet("/DelectServclet")
public class DelectServclet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("bookid");//获取index.jsp传过来的值
		try {
			BookDAOFactory.getInstance().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("/H/Servlet");// 重定向到首页
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
