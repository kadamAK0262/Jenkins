package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.QcModel;
import com.revature.repo.QcRepo;

@Service
public class QcService {
	
	@Autowired
	private QcRepo repo;
	
	public List<QcModel> getdetails() {
		
		return repo.findAll();
	}
	
	public QcModel getbyid(int id) {
		return repo.findById(id).get();
	}
	
	
	

}
