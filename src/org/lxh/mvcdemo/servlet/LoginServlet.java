package org.lxh.mvcdemo;

import java.io.IOException;
import java.servlet.ServletException;
import java.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lxh.mvcdemo.factory.DAOFactory;
import org.lxh.mvcdemo.vo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String userpass = request.getParameter("userpass");
		User user = new User();
		user.setUserid(userid);
		user.setPassword(userpass);
		try {
			if (DAOFactory.getIUserDAOInstance().findLogin(user)) {//通过工厂类取得代理类的实例去调用代理类的findLogin方法
				response.sendRedirect("Servlet");//登录成功进入主页	
			} else {
				response.sendRedirect("loginFail.jsp");//登录失败进入失败的页面
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
