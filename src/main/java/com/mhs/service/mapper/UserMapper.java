package com.mhs.service.mapper;

import java.util.List;

import com.mhs.vo.UserVO;

public interface UserMapper {

	List<UserVO> selectAllUser();
	UserVO selectOneUser(String id);
	
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	void deleteUser(String id);
}