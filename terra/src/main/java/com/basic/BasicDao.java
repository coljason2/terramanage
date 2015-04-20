package com.basic;

import java.util.List;

import com.entity.customer;

public abstract class BasicDao<T extends BasicEntity> {

	public abstract void inertObject(T object);

	public abstract int updateObject(T object);

	public abstract int deleteObject(T object);

	public abstract T findone(Integer id);

	public abstract List<T> findAll(String str);

}
