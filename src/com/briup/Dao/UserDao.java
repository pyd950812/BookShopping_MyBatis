package com.briup.Dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.Bean.UserBean;
import com.briup.Mapper.UserMapper;
import com.briup.Util.MyBatisSqlSessionFactory;

public class UserDao {
	//�������е��û�
	public List<UserBean> findAllUser(){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		List<UserBean> list= mapper.findAllUser();
		session.commit();
		return list;
		
	}
	
	 //����û�
	public void addUser(UserBean user) {
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		mapper.addUser(user);
		session.commit();
		System.out.println("����û��ɹ�");
	}
	//ͨ���û����ҵ��û�
	public UserBean findUserByName(String name) {
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		UserBean user=null;
		user=mapper.findUserByName(name);
		session.commit();
		return user ;
	}
	//�����û���Ϣ
	public void updateUser(UserBean user){
		SqlSession session=MyBatisSqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		mapper.updateUser(user);
		session.commit();
		System.out.println("�����û��ɹ���");
	}
	
	//�����û�����
	public void changePasswd(String name,String newPassword){
		UserDao dao=new UserDao();
		UserBean user=dao.findUserByName(name);
		user.setPassword(newPassword);
		updateUser(user);
	}
	
	
	
	
	
	
}
