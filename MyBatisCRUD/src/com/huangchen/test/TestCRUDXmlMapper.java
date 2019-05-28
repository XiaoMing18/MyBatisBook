package com.huangchen.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.huangchen.domain.User;
import com.huangchen.util.MyBatisUtil;

public class TestCRUDXmlMapper {
	@Test
	public void testAll(){
		//SqlSession sqlSession = MyBatisUtil.getSqlSession(false);
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * 映射sql的标识字符串，
		 * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
		 * addUser是insert标签的id属性值，通过insert标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.addUser";//映射sql的标识字符串
		User user = new User();
		user.setName("xiaomin");
		user.setAge(50);
		//执行插入操作
		int retResult = sqlSession.insert(statement,user);
		//手动提交事务
		//sqlSession.commit();
		//使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(retResult);
	}
	@Test
	public void testUpdate(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * 映射sql的标识字符串，
		 * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
		 * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.updateUser";
		User user = new User();
		user.setId(2);
		user.setName("XiaoMing18");
		user.setAge(78);
		int retResult = sqlSession.update(statement,user);
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testDelete(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * 映射sql的标识字符串，
		 * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
		 * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.deleteUser";
		//执行删除操作
		int retResult = sqlSession.delete(statement,2);
		sqlSession.close();
		System.out.println(retResult);
	}


	@Test
	public void testGetAll(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * 映射sql的标识字符串，
		 * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
		 * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.getAllUsers";
		//执行查询操作，将查询结果自动封装成List<User>返回
		List<User> lsUsers = sqlSession.selectList(statement); 
		sqlSession.close();
		System.out.println(lsUsers);
	}

}
