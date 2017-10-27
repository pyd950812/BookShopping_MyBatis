package com.briup.Dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.UserBean;
import com.briup.Mapper.UserMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class UserDao {
	//查找所有的用户
	public List<UserBean> findAllUser(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		List<UserBean> list= mapper.findAllUser();
		session.commit();
		return list;
		
	}
	
	 //添加用户
	public void addUser(UserBean user) {
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		mapper.addUser(user);
		session.commit();
		System.out.println("添加用户成功");
	}
	//通过用户名找到用户
	public UserBean findUserByName(String name) {
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		UserBean user=null;
		user=mapper.findUserByName(name);
		session.commit();
		return user ;
	}
	//更新用户信息
	public void updateUser(UserBean user){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		mapper.updateUser(user);
		session.commit();
		System.out.println("更新用户成功！");
	}
	
	//更改用户密码
	public void changePasswd(String name,String newPassword){
		UserDao dao=new UserDao();
		UserBean user=dao.findUserByName(name);
		user.setPassword(newPassword);
		updateUser(user);
	}
	
	
	
	
	
	
}
