package com.briup.Mapper;

import java.util.List;

import com.briup.Bean.UserBean;

public interface UserMapper {
	public void addUser(UserBean user);
	public UserBean findUserByName(String name);
	public void updateUser(UserBean user);
	public void changePasswd(String name,String newPassword);
	public List<UserBean> findAllUser();
}
