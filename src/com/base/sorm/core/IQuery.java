package com.base.sorm.core;

import java.util.List;

/**
 * 对外提供服务的核心类
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public interface IQuery {

	/**
	 * 直接执行一个DML语句
	 * @param sql
	 * @param params 参数
	 * @return  影响的记录行数
	 */
	int executeDML(String sql,Object[] params);
	
	/**
	 * 将对象存储到数据中
	 * @param obj
	 */
	void insert(Object obj);
	
	/**
	 * 删除clazz对应表中的记录
	 * @param clazz 跟表对应的Class对象
	 * @param id
	 */
	void delete(Class clazz,Object id);
	
	/**
	 * 删除对象在表中的记录
	 * @param obj
	 */
	void delete(Object obj);
	
	/**
	 * 更新对象对应的记录
	 * @param obj
	 * @param params  更新的值
	 * @return
	 */
	int update(Object obj,String[] params);
	
	/**
	 * 返回多条记录
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	List queryRows(String sql,Class clazz,Object[] params);
	
	
	/**
	 * 返回一个对象
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	Object queryUniqueRow(String sql,Class clazz,Object[] params);
	
	
}
