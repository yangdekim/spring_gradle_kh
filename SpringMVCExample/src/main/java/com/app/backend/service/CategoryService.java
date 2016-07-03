package com.app.backend.service;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.backend.dao.CategoryDao;
import com.app.backend.json.JCategory;

/**
 * created on 20/06/2016
 * @author ksun
 *
 */
@Service("categoryService")
public class CategoryService {

	private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);
	
	@Autowired
	private CategoryDao dao;
    
    public List<JCategory> getCategoriesByType(String type) {
        return Collections.emptyList();
    }
    
    public List<JCategory> getAll() {
        List<JCategory> dList= dao.getAll();
        LOG.info("====== getAll Category[Service]: {}", dList);
        return dList;
    }
    
    @Autowired
    public void setDao(CategoryDao dao) {
        this.dao = dao;
    }
}
