package com.base.sorm.utils;

public class JavaFileUtil {

	/**
	 * 字段
	 */
	private String name;

	/**
	 * 字段类型
	 */
	private String dataType;

	/**
	 * 0:普通键 1：主键 2：外键
	 */
	private int keyType;

	public JavaFileUtil() {
	}

	public JavaFileUtil(String name, String dataType, int keyType) {
		this.name = name;
		this.dataType = dataType;
		this.keyType = keyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getKeyType() {
		return keyType;
	}

	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}

}
