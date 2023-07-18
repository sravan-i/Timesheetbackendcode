package com.shravani.TimeSheetApp.service;

import com.shravani.TimeSheetApp.dto.AddNewProjectDto;
import com.shravani.TimeSheetApp.entity.AddNewProjectManager;

public interface ProjectManagerService {

	public AddNewProjectManager addNewProject(AddNewProjectDto form);

}
