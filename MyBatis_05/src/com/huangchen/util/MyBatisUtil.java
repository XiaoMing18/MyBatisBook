package com.huangchen.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	/**
	 * ��ȡsqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		String resource = "conf.xml";
		InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		return factory;
	}

	/**
	 * ��ȡsqlSession
	 */
	public static SqlSession getSession(){
		return getSqlSessionFactory().openSession();

	}
	/**
	 * ��ȡSqlSession
	 * @param isAutoCommit 
	 *         true ��ʾ������SqlSession������ִ����SQL֮����Զ��ύ����
	 *         false ��ʾ������SqlSession������ִ����SQL֮�󲻻��Զ��ύ������ʱ����Ҫ�����ֶ�����sqlSession.commit()�ύ����
	 * @return SqlSession
	 */
	public static SqlSession getSqlSession(boolean isAutoCommit){
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
