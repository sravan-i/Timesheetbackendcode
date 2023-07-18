package com.shravani.TimeSheetApp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shravani.TimeSheetApp.dto.AddNewProjectDto;
import com.shravani.TimeSheetApp.entity.AddNewProjectManager;
import com.shravani.TimeSheetApp.repository.AddNewProjectRepository;
import com.shravani.TimeSheetApp.util.TimeCardId;

@Service
public class ProjectManagerServiceImp implements ProjectManagerService{
	@Autowired
	private AddNewProjectRepository repo;
	
	@Autowired
	private TimeCardId timeCardId;
	

	
	@Override
	public AddNewProjectManager addNewProject(AddNewProjectDto form) {
		if(form!=null)
		{
			AddNewProjectManager entity =new AddNewProjectManager();
			BeanUtils.copyProperties(form, entity);
			entity.setTimeCardId(timeCardId.timeCardId());
			entity.setTotalHours(form.getMonHours()+form.getTueHours()+form.getWedHours()+form.getThuHours()+form.getFriHours()+form.getSatHours()+form.getSunHours());
			repo.save(entity);
			return entity;
		}
		return null;
		
	}

}
