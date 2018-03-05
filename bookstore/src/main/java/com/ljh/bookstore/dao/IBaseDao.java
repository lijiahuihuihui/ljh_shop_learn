package com.ljh.bookstore.dao;

import java.util.List;

/**
 * dao 基础接口
 * @author skj
 *
 */
public interface IBaseDao<T>{

	/**
	 * 通过id查询实体
	 * @param id
	 * @return
	 */
	T selectById(String id) ; 
	
	/**
	 * 添加实体到数据库中
	 * @param t
	 * @return
	 */
	boolean insert(T t) ; 
	
	/**
	 * 分页查询实体
	 * @param pageNow
	 * @param pageSize
	 * @return
	 */
	List<T> selectByPage(int pageNow , int pageSize) ; 
	
	/**
	 * 通过i删除实体信息
	 * @param id
	 * @return
	 */
	boolean deleteById(String id) ; 
	
	/**
	 * 更新实体信息
	 * @param t
	 * @return
	 */
	boolean update(T t) ; 
	
}



















