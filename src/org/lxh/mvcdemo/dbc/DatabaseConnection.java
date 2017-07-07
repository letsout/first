package org.lxh.mvcdemo.dbc;

import java.sql.*;
//链接数据库
 public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/mldn?characterEncoding=UTF-8";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "123";
	private Connection conn = null;

	public DatabaseConnection() throws Exception {
		try {
			Class.forName(DBDRIVER);//加载数据驱动
			this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);//链接数据库
		} catch (Exception e) {
			throw e;
		}
	}

	public Connection getConnection() {//开始链接
		return this.conn;
	}

	public void close() throws Exception {//关闭连接
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}