package com.shravani.TimeSheetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shravani.TimeSheetApp.entity.AddNewProjectManager;
@Repository
public interface AddNewProjectRepository extends JpaRepository<AddNewProjectManager, Integer>{

}
