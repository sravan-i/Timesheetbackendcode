package com.shravani.TimeSheetApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shravani.TimeSheetApp.dto.AddNewProjectDto;
import com.shravani.TimeSheetApp.entity.AddNewProjectManager;
import com.shravani.TimeSheetApp.service.ProjectManagerService;

@RestController
@CrossOrigin("*")
public class AddNewController {
	
	@Autowired
	private ProjectManagerService service;
	
	@PostMapping("/save")
	public AddNewProjectManager addNewProject (@RequestBody AddNewProjectDto form)
	{
		return service.addNewProject(form);
	}

}
