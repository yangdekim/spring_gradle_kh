package com.app.backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.backend.json.JCategory;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Override
	public JCategory findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(JCategory domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JCategory> getAll() {
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JCategory> getPage(int limit, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JCategory> getAllWithOffset(int limit, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

}
