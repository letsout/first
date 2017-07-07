package org.lxh.mvcdemo.dbc;

import java.sql.*;
//�������ݿ�
 public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/mldn?characterEncoding=UTF-8";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "123";
	private Connection conn = null;

	public DatabaseConnection() throws Exception {
		try {
			Class.forName(DBDRIVER);//������������
			this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);//�������ݿ�
		} catch (Exception e) {
			throw e;
		}
	}

	public Connection getConnection() {//��ʼ����
		return this.conn;
	}

	public void close() throws Exception {//�ر�����
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}