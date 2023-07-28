package com.smartapps.smartapp.web.controller;

import java.io.IOException;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.codehaus.plexus.util.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartapps.smartapp.web.util.SmartAppWebUtil;
import com.smartapps.smartlib.annotations.GlobalApiReponsesGet;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Validated
@RequestMapping(path = SmartAppWebUtil.CONTEXT_ROOT, produces = MediaType.APPLICATION_JSON)
public class SmartAppController extends CommonController {

	@Operation(summary = SmartAppWebUtil.RETRIEVE_HELLO_OPERATION)
	@GlobalApiReponsesGet
	@GetMapping(SmartAppWebUtil.RETRIEVE_HELLO)
	public ResponseEntity<String> hello() 
			throws IOException {
		return ResponseEntity.ok().body("Welcome to My Smartapps world");
	}

	@Operation(summary = SmartAppWebUtil.RETRIEVE_HELLOBYNAME_OPERATION)
	@GlobalApiReponsesGet
	@GetMapping(SmartAppWebUtil.RETRIEVE_HELLOBYNAME)
	public ResponseEntity<String> hellodByName(
			@PathVariable("name") @Valid String name) {
		return ResponseEntity.ok().body(StringUtils.isNotEmpty(name) ? "Welcome Mr. " + name.toUpperCase() : "None provided");
	}
	
}
