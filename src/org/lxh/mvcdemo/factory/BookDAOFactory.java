package org.lxh.mvcdemo.factory;

import org.lxh.mvcdemo.dao.proxy.BookDAOProxy;

public class BookDAOFactory {
	public static BookDAOProxy getInstance() throws Exception {
		return new BookDAOProxy();
	}
}