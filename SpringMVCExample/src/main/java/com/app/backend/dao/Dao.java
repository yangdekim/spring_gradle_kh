package com.app.backend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.app.backend.json.JCategory;

/**
 * created on 20/06/2016
 * @author ksun
 *
 * @param <T>
 */
public interface Dao <T extends Object>{

	 T findById(@Param("id") long id);
	    
    //void add(T domain);
        
    void update(T domain);
    
   //Select("select * from category")
    List<JCategory> getAll();
    
    void remove(@Param("id") long id);
    
    List<T> getPage(@Param("limit") int limit, @Param("offset") int offset);
    
    List<T> getAllWithOffset(@Param("limit") int limit, @Param("offset") int offset);
    
    Integer count();
}
