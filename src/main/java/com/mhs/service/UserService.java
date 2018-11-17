package com.mhs.service;

import java.util.List;

import com.mhs.vo.UserVO;

public interface UserService {

	List<UserVO> selectAllUser();
	UserVO selectOneUser(String id);
	
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	void deleteUser(String id);
}
