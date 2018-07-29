package com.base.sorm.core;

/**
 * 负责Java类型与数据库类型相互转化
 * @author Administrator
 *
 */
public interface TypeConvetor {

	/**
	 * 数据库类型转化为Java类型
	 * @param columnType
	 * @return
	 */
	String databaseType2JavaType(String columnType);
	
	/**
	 * Java类型转为数据库类型
	 * @param javaType
	 * @return
	 */
	String javaType2dataBaseType(String javaType);
}
