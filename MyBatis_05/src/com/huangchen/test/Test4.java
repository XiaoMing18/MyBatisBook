package com.huangchen.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.huangchen.domain.Order;
import com.huangchen.util.MyBatisUtil;

public class Test4 {
	@Test
	public void testGetOrderById(){
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * ӳ��sql�ı�ʶ�ַ�����
		 * com.huangchen.mapping.orderMapper��orderMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * getOrderById��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.getOrderById";//ӳ��sql�ı�ʶ�ַ�
		//ִ�в�ѯ����������ѯ����Զ���װ��Order���󷵻�
		Order order = sqlSession.selectOne(statement,1);//��ѯorders����idΪ1�ļ�¼
		//ʹ��SqlSessionִ����sql֮����Ҫ�ر�SqlSession
		sqlSession.close();
		System.out.println(order);//��ӡ���:null��Ҳ����û�в�ѯ����Ӧ��¼
	}

	@Test
	public void testGetOrderById2(){
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * ӳ��sql�ı�ʶ�ַ�����
		 * com.huangchen.mapping.orderMapper��orderMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * selectOrder��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.selectOrder";//ӳ��sql�ı�ʶ�ַ���
		//ִ�в�ѯ����������ѯ����Զ���װ��Order���󷵻�
		Order order = sqlSession.selectOne(statement,1);//��ѯorders����idΪ1�ļ�¼
		//ʹ��SqlSessionִ����sqlֻ����Ҫ�ر�SqlSession
		sqlSession.close();
		System.out.println(order);
		//��ӡ���:Order [id=1, orderNo=angle, price=23.0, getId()=1, getOrderNo()=angle, getPrice()=23.0, getClass()=class com.huangchen.domain.Order, hashCode()=1529303166, toString()=com.huangchen.domain.Order@5b27507e]

	}


	@Test
	public void testGetOrderById3(){
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * ӳ��sql�ı�ʶ�ַ�����
		 * com.huangchen.mapping.orderMapper��orderMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * selectOrder��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.selectOrderResultMap";//ӳ��sql�ı�ʶ�ַ���
		//ִ�в�ѯ����������ѯ����Զ���װ��Order���󷵻�
		Order order = sqlSession.selectOne(statement,1);//��ѯorders����idΪ1�ļ�¼
		//ʹ��SqlSessionִ����sqlֻ����Ҫ�ر�SqlSession
		sqlSession.close();
		System.out.println(order);
		//��ӡ���:Order [id=1, orderNo=angle, price=23.0, getId()=1, getOrderNo()=angle, getPrice()=23.0, getClass()=class com.huangchen.domain.Order, hashCode()=1529303166, toString()=com.huangchen.domain.Order@5b27507e]

	}

}
