package com.base.sorm.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.base.sorm.bean.Configuration;

/**
 * 封装配置信息
 * 
 * @author Administrator
 *
 */
public class DBManager {

	private static Configuration conf;

	// 静态代码块，只加载一次
	static {
		Properties prop = new Properties();
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		conf = new Configuration();
		conf.setDriver(prop.getProperty("driver"));
		conf.setUrl(prop.getProperty("url"));
		conf.setUser(prop.getProperty("user"));
		conf.setPwd(prop.getProperty("pwd"));
		conf.setUsingDB(prop.getProperty("usingDB"));
		conf.setSrcPath(prop.getProperty("srcPath"));
		conf.setPoPackage(prop.getProperty("poPackage"));
	}

	/**
	 * 获取连接
	 * @return
	 */
	public static Connection getConn() {
		try 
		{
			Class.forName(conf.getDriver());
			//后期增加连接池
			return DriverManager.getConnection(conf.getUrl(), conf.getUser(), conf.getPwd());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
