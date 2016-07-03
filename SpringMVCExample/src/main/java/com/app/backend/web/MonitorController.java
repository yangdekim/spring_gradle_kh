package com.app.backend.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.backend.json.JMonitor;
import com.app.backend.service.Version;

@Controller
@RequestMapping(value = "monitor")
public class MonitorController {

	private static final Logger LOG = LoggerFactory.getLogger(MonitorController.class);
	
	@RequestMapping(value = "v1", method = RequestMethod.GET)
	public ResponseEntity<JMonitor> getMonitor(HttpServletRequest request) {
		JMonitor monitor = new JMonitor();
		final String version = Version.getVersion(request.getSession().getServletContext());
		monitor.setVersion(version);
		monitor.setMillis(System.currentTimeMillis());
		monitor.setIp(request.getRemoteAddr());
		
		LOG.info(String.format("======= Monitor: [version: %s, millis: %s, ip: %s]", version, System.currentTimeMillis(), request.getRemoteAddr()));
		
		return new ResponseEntity<>(monitor, HttpStatus.OK);
	}
}