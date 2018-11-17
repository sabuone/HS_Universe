package com.mhs;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mhs.service.UserService;
import com.mhs.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/*.xml"})
public class UserTest {

	@Autowired
	UserService userService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Test
	@Ignore
	public void insertUser() {
		UserVO user = new UserVO();
		user.setUserId("admin");
		user.setUserPassword(passwordEncoder.encode("admin20"));
		user.setUserName("관리자");
		userService.insertUser(user);
	}
	
	@Test
	@Ignore
	public void checkUser() {
		UserVO user = userService.selectOneUser("test4");
		
		if (passwordEncoder.matches("1231", user.getUserPassword())) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	@Test
	@Ignore
	public void updateUser() {
		UserVO user = new UserVO();
		user.setUserId("test7");
		user.setUserName("테스트77");
		user.setRole("ADMIN");
		userService.updateUser(user);
	}
	
	@Test
	@Ignore
	public void deleteUser() {
		userService.deleteUser("test3");
	}
	
	@Test
	@Ignore
	public void selectOneUser() {
		UserVO user = userService.selectOneUser("test7");
		System.out.println(user.toString());
	}

	@Test
	@Ignore
	public void selectAllUser() {
		List<UserVO> userList = userService.selectAllUser();
		System.out.println(userList.toString());
	}

}
