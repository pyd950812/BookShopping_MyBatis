package com.briup.Test;



import java.util.List;

import com.briup.Bean.UserBean;
import com.briup.Dao.UserDao;

public class UserDaoTest {
	public static void main(String[] args) {
		UserDao dao=new UserDao();
		//UserBean user=new UserBean("��ϴ", "5555", "220330", "������ɽ", "12345", "sadasda");
		//dao.addUser(user);
//		UserBean user= dao.findUserByName("����");
//		System.out.println(user);
		List<UserBean> list= dao.findAllUser();
		System.out.println(list);
		
	}
}
