package com.basic;

import java.util.List;

public abstract class BasicDao<T extends BasicEntity> {

	public abstract void inertObject();

	public abstract int updateObject();

	public abstract int deleteObject();

	public abstract T findone();

	public abstract List<T> findAll();
}
