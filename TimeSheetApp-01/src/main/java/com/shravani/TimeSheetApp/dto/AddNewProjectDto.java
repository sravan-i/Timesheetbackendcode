package com.shravani.TimeSheetApp.dto;

import lombok.Data;

@Data
public class AddNewProjectDto {
	private String projectManagerName;
	
	private Integer monHours;
	private Integer tueHours;
	private Integer wedHours;
	private Integer thuHours;
	private Integer friHours;
	private Integer satHours;
	private Integer sunHours;
	private String comment;

}
