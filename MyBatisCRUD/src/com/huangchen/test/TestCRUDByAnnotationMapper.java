package com.huangchen.test;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.huangchen.domain.User;
import com.huangchen.mapping.UserMapperI;
import com.huangchen.util.MyBatisUtil;

public class TestCRUDByAnnotationMapper {
	@Test
	public void testAdd(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		//得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来  
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		User user = new User();
		user.setName("user1");
		user.setAge(11);
		int add = mapper.add(user);
		sqlSession.close();
		System.out.println(add);
	}

	@Test
	public void testUpdate(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		//得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来  
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		User user = new User();
		user.setId(3);
		user.setName("person");
		user.setAge(28);
		//执行修改操作
		int reResult = mapper.update(user);
		sqlSession.close();
		System.out.println(reResult);
	}


	@Test
	public void testDelete(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);		
		int reResult = mapper.deleteById(5);
		sqlSession.close();
		System.out.println(reResult);
	}


	@Test
	public void testGetUser(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);		
		User user = mapper.getById(6);
		sqlSession.close();
		System.out.println(user);
	}

	@Test
	public void testGetAll(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);		
		List<User> lsUsers = mapper.getAll();
		sqlSession.close();
		System.out.println(lsUsers);
	}
}
