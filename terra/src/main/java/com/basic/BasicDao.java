package com.basic;

import java.util.List;

public interface BasicDao<T extends BasicEntity> {

	public abstract void inertObject(T object);

	public abstract int updateObject(T object);

	public abstract int deleteObject(T object);

	public abstract T findone(Integer id);

	public abstract List<T> findAll(String str);

}
