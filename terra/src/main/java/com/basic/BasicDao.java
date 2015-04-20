package com.basic;

import java.util.List;

public interface BasicDao<T extends BasicEntity> {

	public void inertObject();

	public int updateObject();

	public int deleteObject();

	public T findone();

	public List<T> findAll();
}
