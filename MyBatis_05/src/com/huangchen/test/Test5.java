package com.huangchen.test;

import org.apache.ibatis.session.SqlSession;


import org.junit.Test;

import com.huangchen.domain.Classes;
import com.huangchen.util.MyBatisUtil;

public class Test5 {
		@Test
		public void testGetClass(){
			SqlSession sqlSession = MyBatisUtil.getSession();
			/**
			 * 映射sql的标识字符串
			 * com.huangchen.mapping.classMapper是classMapper.xml文件中mapper标签中的namespace属性的值
			 * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的sql
			 */
			String statement = "com.huangchen.mapping.classMapper.getClass";
			//执行查询操作，将查询结果自动封装成Classes对象返回
			Classes clazz = sqlSession.selectOne(statement,1);
			//使用SqlSession执行完sql之后需要关闭sqlSession
			sqlSession.close();
			System.out.println(clazz);//打印结果:Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=1022308509, toString()=com.huangchen.domain.Teacher@3cef309d], getTeacher()=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=1022308509, toString()=com.huangchen.domain.Teacher@3cef309d], getId()=1, getName()=class_a, getClass()=class com.huangchen.domain.Classes, hashCode()=846238611, toString()=com.huangchen.domain.Classes@32709393]
		}

	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * 映射sql的标识字符串
		 * com.huangchen.mapping.classMapper是classMapper.xml文件中mapper标签中的namespace属性的值
		 * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的sql
		 */
		String statement = "com.huangchen.mapping.classMapper.getClass2";
		//执行查询操作，将查询结果自动封装成Classes对象返回
		Classes clazz = sqlSession.selectOne(statement,1);
		//使用SqlSession执行完sql之后需要关闭sqlSession
		sqlSession.close();
		System.out.println(clazz);//打印结果:Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=36333492, toString()=com.huangchen.domain.Teacher@22a67b4], getTeacher()=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=36333492, toString()=com.huangchen.domain.Teacher@22a67b4], getId()=1, getName()=class_a, getClass()=class com.huangchen.domain.Classes, hashCode()=1468357786, toString()=com.huangchen.domain.Classes@57855c9a]

	}
}
