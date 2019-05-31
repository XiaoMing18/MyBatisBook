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
			 * ӳ��sql�ı�ʶ�ַ���
			 * com.huangchen.mapping.classMapper��classMapper.xml�ļ���mapper��ǩ�е�namespace���Ե�ֵ
			 * getClass��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�sql
			 */
			String statement = "com.huangchen.mapping.classMapper.getClass";
			//ִ�в�ѯ����������ѯ����Զ���װ��Classes���󷵻�
			Classes clazz = sqlSession.selectOne(statement,1);
			//ʹ��SqlSessionִ����sql֮����Ҫ�ر�sqlSession
			sqlSession.close();
			System.out.println(clazz);//��ӡ���:Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=1022308509, toString()=com.huangchen.domain.Teacher@3cef309d], getTeacher()=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=1022308509, toString()=com.huangchen.domain.Teacher@3cef309d], getId()=1, getName()=class_a, getClass()=class com.huangchen.domain.Classes, hashCode()=846238611, toString()=com.huangchen.domain.Classes@32709393]
		}

	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * ӳ��sql�ı�ʶ�ַ���
		 * com.huangchen.mapping.classMapper��classMapper.xml�ļ���mapper��ǩ�е�namespace���Ե�ֵ
		 * getClass��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�sql
		 */
		String statement = "com.huangchen.mapping.classMapper.getClass2";
		//ִ�в�ѯ����������ѯ����Զ���װ��Classes���󷵻�
		Classes clazz = sqlSession.selectOne(statement,1);
		//ʹ��SqlSessionִ����sql֮����Ҫ�ر�sqlSession
		sqlSession.close();
		System.out.println(clazz);//��ӡ���:Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=36333492, toString()=com.huangchen.domain.Teacher@22a67b4], getTeacher()=Teacher [id=1, name=teacher1, getId()=1, getName()=teacher1, getClass()=class com.huangchen.domain.Teacher, hashCode()=36333492, toString()=com.huangchen.domain.Teacher@22a67b4], getId()=1, getName()=class_a, getClass()=class com.huangchen.domain.Classes, hashCode()=1468357786, toString()=com.huangchen.domain.Classes@57855c9a]

	}
}
