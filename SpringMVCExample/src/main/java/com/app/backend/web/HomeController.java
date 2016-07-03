package com.app.backend.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * created on 20/06/2016
 * @author ksun
 *
 */
@Controller
@RequestMapping("home")
public class HomeController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "v1/message", method = RequestMethod.GET)
	public ResponseEntity<String> getMessage() {
		LOG.info("========= getMessage Method ======");
		return new ResponseEntity<String>("home controller", HttpStatus.OK);
	}
	
}
