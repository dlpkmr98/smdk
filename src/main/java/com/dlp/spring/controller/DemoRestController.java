package com.dlp.spring.controller;

import java.io.IOException;

import javax.security.auth.login.LoginException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/dlp")
public class DemoRestController {

	private static final Logger LOG = LoggerFactory.getLogger(DemoRestController.class);

	@ApiOperation("Service to print application name")
	@RequestMapping(method = RequestMethod.GET, value = "/demo")
	@ResponseBody
	public String demo() throws IOException, LoginException {
		LOG.info("listTables invoked.");
		return "Demo Application";
	}

}
