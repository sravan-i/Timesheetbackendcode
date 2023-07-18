package com.shravani.TimeSheetApp.service;
import com.shravani.TimeSheetApp.dto.UserDto;
import com.shravani.TimeSheetApp.entity.Role;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> findAllUsers();

    UserDto findUserByEmail(String email);

    UserDto saveUser(UserDto userDto);

    UserDto findUserByName(String userName);
    //public boolean forgotPwd(String email);
    List<UserDto> findUsersByRole(String role);

    public boolean forgotPwd(String email) ;

	public List<Role> retriveUnique(String request);
}
