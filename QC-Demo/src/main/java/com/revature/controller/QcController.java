package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.QcModel;
import com.revature.service.QcService;

@RestController
public class QcController {
	
	@Autowired
	private QcService serve;
	
	@GetMapping("/getdetails")
	public List<QcModel> getallDetails() {
		return serve.getdetails();
	}
	
	@GetMapping("/getdetails/{id}")
	public QcModel getdetailsByid(@PathVariable int  id) {
		return serve.getbyid(id);
	}

}
