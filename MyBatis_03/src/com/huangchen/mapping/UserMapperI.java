package com.huangchen.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.huangchen.domain.User;

/**
 * ����sqlӳ��Ľӿڣ�ʹ��ע��ָ������Ҫִ�е�SQL
 * @author huangchen
 *
 */
public interface UserMapperI {
	//ʹ��@Insertע��ָ��add����Ҫִ�е�SQL
	@Insert("insert into users(name, age) values(#{name},#{age})")
	public int add(User user);

	//ʹ��@Delectע��ָ��delete����Ҫִ�е�SQL
	@Delete("delete from users where id = #{id}")
	public int deleteById(int id);


	//ʹ��@Updateע��ָ��add����Ҫִ�е�SQL
	@Update("update users set name = #{name},age = #{age} where id=#{id}")
	public int update(User user);


	//ʹ��@Selectע��ָ��add����Ҫִ�е�SQL
	@Select("select * from users where id =#{id}")
	public User getById(int id);

	//ʹ��@Selectע��ָ��add����Ҫִ�е�SQL
	@Select("select * from users")
	public List<User> getAll();

}
