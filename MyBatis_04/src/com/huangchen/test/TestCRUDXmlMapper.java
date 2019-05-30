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
		 * ӳ��sql�ı�ʶ�ַ�����
		 * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * addUser��insert��ǩ��id����ֵ��ͨ��insert��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.addUser";//ӳ��sql�ı�ʶ�ַ���
		User user = new User();
		user.setName("xiaomin");
		user.setAge(50);
		//ִ�в������
		int retResult = sqlSession.insert(statement,user);
		//�ֶ��ύ����
		//sqlSession.commit();
		//ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
		sqlSession.close();
		System.out.println(retResult);
	}
	@Test
	public void testUpdate(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * ӳ��sql�ı�ʶ�ַ�����
		 * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * updateUser��update��ǩ��id����ֵ��ͨ��update��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
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
		 * ӳ��sql�ı�ʶ�ַ�����
		 * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * updateUser��update��ǩ��id����ֵ��ͨ��update��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.deleteUser";
		//ִ��ɾ������
		int retResult = sqlSession.delete(statement,2);
		sqlSession.close();
		System.out.println(retResult);
	}


	@Test
	public void testGetAll(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		/**
		 * ӳ��sql�ı�ʶ�ַ�����
		 * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * updateUser��update��ǩ��id����ֵ��ͨ��update��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.userMapper.getAllUsers";
		//ִ�в�ѯ����������ѯ����Զ���װ��List<User>����
		List<User> lsUsers = sqlSession.selectList(statement); 
		sqlSession.close();
		System.out.println(lsUsers);
	}

}
