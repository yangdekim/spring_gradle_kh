package com.app.backend.web;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.backend.json.JCategory;
import com.app.backend.service.CategoryService;

@Controller
@RequestMapping(value = "category")
public class CategoryController {

	private static final Logger LOG = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value = "v1/all", method = RequestMethod.GET)
	public ResponseEntity<Collection<JCategory>> getAllCategories() {
		Collection<JCategory> category = service.getAll();
		if (null == category) {
			LOG.info("=========== no category return");
		} else {
			LOG.info("=========== category: {}", category);
		}
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
	
}
