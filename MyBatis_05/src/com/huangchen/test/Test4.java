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
		 * 映射sql的标识字符串，
		 * com.huangchen.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
		 * getOrderById是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.getOrderById";//映射sql的标识字符
		//执行查询操作，将查询结果自动封装成Order对象返回
		Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
		//使用SqlSession执行完sql之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(order);//打印结果:null，也就是没有查询出相应记录
	}

	@Test
	public void testGetOrderById2(){
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * 映射sql的标识字符串，
		 * com.huangchen.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
		 * selectOrder是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.selectOrder";//映射sql的标识字符串
		//执行查询操作，将查询结果自动封装成Order对象返回
		Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
		//使用SqlSession执行完sql只够需要关闭SqlSession
		sqlSession.close();
		System.out.println(order);
		//打印结果:Order [id=1, orderNo=angle, price=23.0, getId()=1, getOrderNo()=angle, getPrice()=23.0, getClass()=class com.huangchen.domain.Order, hashCode()=1529303166, toString()=com.huangchen.domain.Order@5b27507e]

	}


	@Test
	public void testGetOrderById3(){
		SqlSession sqlSession = MyBatisUtil.getSession();
		/**
		 * 映射sql的标识字符串，
		 * com.huangchen.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
		 * selectOrder是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.huangchen.mapping.orderMapper.selectOrderResultMap";//映射sql的标识字符串
		//执行查询操作，将查询结果自动封装成Order对象返回
		Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
		//使用SqlSession执行完sql只够需要关闭SqlSession
		sqlSession.close();
		System.out.println(order);
		//打印结果:Order [id=1, orderNo=angle, price=23.0, getId()=1, getOrderNo()=angle, getPrice()=23.0, getClass()=class com.huangchen.domain.Order, hashCode()=1529303166, toString()=com.huangchen.domain.Order@5b27507e]

	}

}
