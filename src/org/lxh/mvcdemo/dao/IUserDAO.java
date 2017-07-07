package org.lxh.mvcdemo.dao;

import org.lxh.mvcdemo.vo.User;

public interface IUserDAO {
	public boolean findLogin(User user) throws Exception;//
}