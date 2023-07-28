package com.smartapps.smartapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartapps.smartlib.service.MessageService;

public class CommonController {

	@Autowired
	protected MessageService messageService;

}
